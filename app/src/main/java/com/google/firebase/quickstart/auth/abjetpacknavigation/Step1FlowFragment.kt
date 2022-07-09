package com.google.firebase.quickstart.auth.abjetpacknavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController


import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.step1_flow.*

class Step1FlowFragment : Fragment() {

    val args: Step1FlowFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.step1_flow, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        statusTextView.text = args.name

        nextFlowButton.setOnClickListener {
            val age = 40
            val action = Step1FlowFragmentDirections.actionFlowStep1ToFlowStep2(age)
            findNavController().navigate(action)
        }
    }
}