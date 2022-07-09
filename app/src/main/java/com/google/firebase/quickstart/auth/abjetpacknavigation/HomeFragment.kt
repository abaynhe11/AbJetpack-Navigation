package com.google.firebase.quickstart.auth.abjetpacknavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        startFlowButton.setOnClickListener {
            // findNavController().navigate(R.id.flow_step1, null)
            val name = "Desmond"
            val action = HomeFragmentDirections.actionNavigateHomeToFlowStep1(name)
            findNavController().navigate(action)
        }
    }
}