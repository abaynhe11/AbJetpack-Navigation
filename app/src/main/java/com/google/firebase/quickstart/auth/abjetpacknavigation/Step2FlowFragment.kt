package com.google.firebase.quickstart.auth.abjetpacknavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.step2_flow.*

class Step2FlowFragment : Fragment() {

    val args: Step2FlowFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.step2_flow, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        statusTextView.text = args.age.toString()

        endFlowButton.setOnClickListener {
            val action = Step2FlowFragmentDirections.actionFlowStep2ToNavigateHome()
            findNavController().navigate(action)
        }
    }
}