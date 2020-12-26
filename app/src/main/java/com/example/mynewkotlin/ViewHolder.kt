package com.example.mynewkotlin

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val itemText : TextView = itemView.findViewById(R.id.tv_dhikr)

}