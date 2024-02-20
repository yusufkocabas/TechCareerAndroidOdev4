package com.yusufkocabas.odev3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.yusufkocabas.odev3.databinding.FragmentSayfaBBinding


class SayfaBFragment : Fragment() {
 private lateinit var binding : FragmentSayfaBBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSayfaBBinding.inflate(inflater, container, false)

        binding.button4.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.sayfaBYGecis)
        }
        return binding.root
    }

}