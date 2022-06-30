package com.muhsanapps.view_binding_practice.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.muhsanapps.view_binding_practice.R
import com.muhsanapps.view_binding_practice.databinding.FragmentBlankBinding

class BlankFragment : Fragment(R.layout.fragment_blank) {

    private var _binding : FragmentBlankBinding? = null

    private val binding get() = _binding!!

  /*  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        _binding = FragmentBlankBinding.inflate(inflater, container, false)

        binding.tvFragment.text = "Hello from main fragment"

        return binding.root

    }*/

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding = FragmentBlankBinding.bind(view)

        binding.tvFragment.text = "Hello from main fragment"

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}