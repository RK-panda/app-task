package com.example.apptask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclreViewNames)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val data = ArrayList<ItemsViewModel>()

        data.add(ItemsViewModel("Roaa Koraiem"))
        data.add(ItemsViewModel("Wafaa Adel"))
        data.add(ItemsViewModel("Salma Ahmed"))
        data.add(ItemsViewModel("Hania Elsaied"))
        data.add(ItemsViewModel("Selvana Samuel"))
        data.add(ItemsViewModel("Ahmed Kamal"))
        data.add(ItemsViewModel("Marwan Mohamed"))
        data.add(ItemsViewModel("Gabaski AboGabal"))
        data.add(ItemsViewModel("Mostafa Koraiem"))
        data.add(ItemsViewModel("Mohamed Ashraf"))

    }
}