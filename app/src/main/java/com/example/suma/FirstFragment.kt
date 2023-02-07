package com.example.suma

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.suma.databinding.FragmentFirstBinding
import com.example.suma.model.dataperson

class FirstFragment : Fragment() {
    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonFirst.setOnClickListener {
            val name = _binding?.name?.text.toString()
            val lastName = _binding?.lastName?.text.toString()
            val age = _binding?.age?.text.toString()

            if (name != "" && lastName != "" && age != "") {
                val data = dataperson(
                    name,
                    lastName,
                    age.toInt()
                )
                findNavController().navigate(
                    FirstFragmentDirections.actionFirstFragmentToSecondFragment(data)
                )
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}