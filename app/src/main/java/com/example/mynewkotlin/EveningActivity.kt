package com.example.mynewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class EveningActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_evening)

        var dhikrsList = mutableListOf<String>()

        var rv_recyclerView: RecyclerView = findViewById(R.id.evening_recycle)

        dhikrsList.add(getString(R.string.dhikr_1))
        dhikrsList.add(getString(R.string.dhikr_2))
        dhikrsList.add(getString(R.string.dhikr_3))
        dhikrsList.add(getString(R.string.dhikr_4))
        dhikrsList.add(getString(R.string.dhikr_5))
        dhikrsList.add(getString(R.string.evening_1))
        dhikrsList.add(getString(R.string.dhikr_6))
        dhikrsList.add(getString(R.string.dhikr_7))
        dhikrsList.add(getString(R.string.evening_2))
        dhikrsList.add(getString(R.string.evening_3))
        dhikrsList.add(getString(R.string.dhikr_8))
        dhikrsList.add(getString(R.string.dhikr_9))
        dhikrsList.add(getString(R.string.evening_4))
        dhikrsList.add(getString(R.string.evening_5))
        dhikrsList.add(getString(R.string.dhikr_10))
        dhikrsList.add(getString(R.string.dhikr_11))
        dhikrsList.add(getString(R.string.dhikr_12))
        dhikrsList.add(getString(R.string.dhikr_13))
        dhikrsList.add(getString(R.string.evening_6))
        dhikrsList.add(getString(R.string.dhikr_14))

        rv_recyclerView.layoutManager = LinearLayoutManager(this)
        rv_recyclerView.adapter = RecyclerAdapter(dhikrsList)
    }
}