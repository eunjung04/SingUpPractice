package com.example.singuppractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class EditNameActivity : AppCompatActivity() {

    okBtn.setOnClickListener {

        val myIntent =nameEdt.text.toString()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_name)
    }
}
