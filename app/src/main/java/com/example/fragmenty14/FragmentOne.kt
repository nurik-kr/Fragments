package com.example.fragmenty14

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class FragmentOne : Fragment() {

    private var replace: Button? = null
    private var list: FragmentList? = null


    override fun onAttach(context: Context) {
        super.onAttach(context)
        list = context as FragmentList
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        replace = view.findViewById(R.id.replace)

        replace?.setOnClickListener(){
           list?.changeFragment()
        }


    }
}


