package com.yusufkocabas.odev3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.yusufkocabas.odev3.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {
    private lateinit var binding : FragmentAnasayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater,container, false)


        binding.button.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.anasayfaAGecis)
        }
        binding.button2.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.anasayfaXGecis)

        }

        return binding.root
    }

}