package com.example.mynewkotlin

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        morning_id.setOnClickListener{
            var intent = Intent(this, MorningActivity:: class.java)
            startActivity(intent)

        }

        evening_id.setOnClickListener {
            var intent = Intent(this, EveningActivity:: class.java)
            startActivity(intent)
        }
    }
}