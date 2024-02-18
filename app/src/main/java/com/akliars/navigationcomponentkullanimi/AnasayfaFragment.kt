package com.akliars.navigationcomponentkullanimi

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.akliars.navigationcomponentkullanimi.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.buttonDetay.setOnClickListener {
           // binding.textViewAnasayfa.text = "Merhaba"
            val gecis = AnasayfaFragmentDirections.detayGecis(mesaj = "Merhaba", sayi = 100)

            Navigation.findNavController(it).navigate(gecis)
        }

        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Uygulama çalıştığında bir kere çalışır.
        Log.e("Yaşam Döngüsü","onCreate")
    }

    override fun onPause() {
        super.onPause()
        //Sayfa her görünmez olduğunda çalışır.
        Log.e("Yaşam Döngüsü","onPause")
    }

    override fun onResume() {
        super.onResume()
        //Sayfa her görünür olduğunda çalışır.
        //Bu sayfaya geri dönüldüğünü anlayabiliriz.
        Log.e("Yaşam Döngüsü","onResume")
    }
}