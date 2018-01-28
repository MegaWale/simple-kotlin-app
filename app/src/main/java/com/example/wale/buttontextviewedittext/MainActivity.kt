package com.example.wale.buttontextviewedittext

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var name = editText.text

        showNameBTN.setOnClickListener {

            if (name.isEmpty()) resultView.text = "Enter something stupid" else resultView.text = "Welcome $name"

        }

    }
}
