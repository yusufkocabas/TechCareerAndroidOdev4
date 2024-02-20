package com.yusufkocabas.odev3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.yusufkocabas.odev3.databinding.FragmentSayfaXBinding


class SayfaXFragment : Fragment() {
    private lateinit var binding:FragmentSayfaXBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSayfaXBinding.inflate(inflater, container, false)
        binding.button6.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.SayfaxYGecis)

        }

        return binding.root
    }

}