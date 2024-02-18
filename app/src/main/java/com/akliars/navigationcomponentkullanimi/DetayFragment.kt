package com.akliars.navigationcomponentkullanimi

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.fragment.navArgs
import com.akliars.navigationcomponentkullanimi.databinding.FragmentDetayBinding


class DetayFragment : Fragment() {
    private lateinit var binding: FragmentDetayBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetayBinding.inflate(inflater, container, false)

        val bundle:DetayFragmentArgs by navArgs()//delegate

        binding.textViewDetay.text = "${bundle.mesaj} - ${bundle.sayi}"

        val geriTusu = object : OnBackPressedCallback(true){//Geri dönüş aktif değil
            override fun handleOnBackPressed() {
                Log.e("Detay Sayfa","Geri tuşu tıklandı.")
                isEnabled = false
                requireActivity().onBackPressedDispatcher.onBackPressed()

            }
        }

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner,geriTusu)

        return binding.root
    }

}