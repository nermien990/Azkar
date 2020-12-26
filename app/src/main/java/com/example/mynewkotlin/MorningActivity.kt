package com.example.mynewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MorningActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_morning)

        var dhikrsList = mutableListOf<String>()

        var rv_recyclerView: RecyclerView = findViewById(R.id.morning_recycle)

        dhikrsList.add(getString(R.string.dhikr_1))
        dhikrsList.add(getString(R.string.dhikr_2))
        dhikrsList.add(getString(R.string.dhikr_3))
        dhikrsList.add(getString(R.string.dhikr_4))
        dhikrsList.add(getString(R.string.dhikr_5))
        dhikrsList.add(getString(R.string.morning_1))
        dhikrsList.add(getString(R.string.dhikr_6))
        dhikrsList.add(getString(R.string.dhikr_7))
        dhikrsList.add(getString(R.string.morning_2))
        dhikrsList.add(getString(R.string.morning_3))
        dhikrsList.add(getString(R.string.dhikr_8))
        dhikrsList.add(getString(R.string.dhikr_9))
        dhikrsList.add(getString(R.string.morning_4))
        dhikrsList.add(getString(R.string.morning_5))
        dhikrsList.add(getString(R.string.dhikr_10))
        dhikrsList.add(getString(R.string.dhikr_11))
        dhikrsList.add(getString(R.string.dhikr_12))
        dhikrsList.add(getString(R.string.dhikr_13))
        dhikrsList.add(getString(R.string.morning_6))
        dhikrsList.add(getString(R.string.dhikr_14))

        rv_recyclerView.layoutManager = LinearLayoutManager(this)
        rv_recyclerView.adapter = RecyclerAdapter(dhikrsList)

    }
}

