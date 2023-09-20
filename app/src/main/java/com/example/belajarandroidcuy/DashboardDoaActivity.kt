package com.example.belajarandroidcuy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidcuy.adapter.DoaAdapter
import com.example.belajarandroidcuy.model.Doa

class DashboardDoaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard_doa)
        val rvactivitydoa: RecyclerView = findViewById(R.id.rvDoaDzikir)
        val data = arrayListOf<Doa>(
            Doa("Dzikir dan Doa Sunnah Setelah Shalat", R.drawable.doa_harian2),
            Doa("Dzikir Setiap Saat", R.drawable.doa_harian2),
            Doa("Dzikir Pagi dan Petang", R.drawable.doa_harian2),
            Doa("Dzikir Harian", R.drawable.doa_harian2),
            Doa("Dzikir Setiap Saat", R.drawable.doa_harian2),
            Doa("Dzikir dan Doa Sunnah Sebelum Shalat", R.drawable.doa_harian2)
        )

        val cvSelengkapnya:Button = findViewById(R.id.ivGambarCuy)

        cvSelengkapnya.setOnClickListener {
            val intent = Intent( this,DoaHarianActivity::class.java)
            startActivity(intent)
        }

        val adapter = DoaAdapter(data)

        rvactivitydoa.adapter = adapter

        rvactivitydoa.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
    }
}