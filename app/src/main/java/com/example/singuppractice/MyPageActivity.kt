package com.example.singuppractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MyPageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_page)

        val name=intent.getStringArrayExtra("userName")
        val age=intent.getIntExtra("userAge", -1)

        userNmaeTxt.text="${name} : ${age}세"
    }
}
