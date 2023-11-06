package com.example.amangeldi_abdibaitov_mo3_hw_8

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.amangeldi_abdibaitov_mo3_hw_8.databinding.FragmentNextBinding


class NextFragment : Fragment() {

    private lateinit var binding: FragmentNextBinding
    private lateinit var data: ModelRv

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentNextBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        data = arguments?.getSerializable("2") as ModelRv
        binding.apply {
            tvName.text = data.name
            tvDeadOrAlive.text = data.deadOrAlive
            Glide.with(imgVCharacter).load(data.picture).into(imgVCharacter)
        }
    }
}