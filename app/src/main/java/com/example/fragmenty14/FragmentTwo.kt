package com.example.fragmenty14

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment

class FragmentTwo : Fragment() {

    private var btnRemove: Button? =null
    private var listof: FragmentList? = null


    override fun onAttach(context: Context) {
        super.onAttach(context)
        listof = context as FragmentList
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_two,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnRemove = view.findViewById(R.id.btnRemove)

        btnRemove?.setOnClickListener {
            listof?.deleyeFragment()
        Toast.makeText(context,"udalilas",Toast.LENGTH_SHORT).show()
        }
    }
}