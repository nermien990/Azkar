package com.example.mynewkotlin

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.mynewkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.morningId.setOnClickListener{
            var intent = Intent(this, MorningActivity:: class.java)
            startActivity(intent)
        }

        binding.eveningId.setOnClickListener {
            var intent = Intent(this, EveningActivity:: class.java)
            startActivity(intent)
        }
    }
}