package com.example.fragmenty14

import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity(),FragmentList {

    private var ContainertOne: FrameLayout? = null
    private var btnGo: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupView()
        setupClick()
    }

    private fun setupView() {
        btnGo = findViewById(R.id.btnGo)
    }

    private fun setupClick() {
        btnGo?.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.ContainertOne, FragmentOne())
                .addToBackStack(null)
                .commit()
        }
    }

    override fun changeFragment() {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.ContainertOne, FragmentTwo())
            .addToBackStack(null)
            .commit()
    }

    override fun deleyeFragment() {
        supportFragmentManager
            .beginTransaction()
            .remove(FragmentTwo())
            .addToBackStack(null)
            .commit()
    }
}

