package com.example.belajarandroidcuy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidcuy.adapter.DoaAdapter
import com.example.belajarandroidcuy.adapter.DoaHarianAdapter
import com.example.belajarandroidcuy.model.Doa
import com.example.belajarandroidcuy.model.Doa_Harian

class DoaHarianActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doa_harian)
        val rvDoaActivity: RecyclerView = findViewById(R.id.rvDoaHarian)
        val data = arrayListOf<Doa_Harian>(
            Doa_Harian("Doa Bangun Tidur","اَلْحَمْدُ ِللهِ الَّذِىْ اَحْيَانَا بَعْدَمَآ اَمَاتَنَا وَاِلَيْهِ النُّشُوْرُ", "Alhamdu lillahil ladzii ahyaanaa ba'da maa amaa tanaa wa ilahin nusyuuru"),
            Doa_Harian("Doa Masuk Kamar Mandi Atau Toilet", "اَللّٰهُمَّ اِنّىْ اَعُوْذُبِكَ مِنَ الْخُبُثِ وَالْخَبَآئِثِ", "Alloohumma Innii a'uudzubika minal khubutsi wal khoaaitsi"),
            Doa_Harian("Doa Keluar Kamar Mandi Atau Toilet", "غُفْرَانَكَ الْحَمْدُ ِللهِ الَّذِىْ اَذْهَبَ عَنّى اْلاَذَى وَعَافَانِىْ", "Ghufraanaka. Alhamdulillaahil ladzii adzhaba ‘annjil adzaa wa’aafaanii"),
            Doa_Harian("Doa Masuk Rumah", "اَللّٰهُمَّ اِنّىْ اَسْأَلُكَ خَيْرَالْمَوْلِجِ وَخَيْرَالْمَخْرَجِ بِسْمِ اللهِ وَلَجْنَا وَبِسْمِ اللهِ خَرَجْنَا وَعَلَى اللهِ رَبّنَا تَوَكَّلْنَا", "Allahumma innii as-aluka khoirol mauliji wa khoirol makhroji bismillaahi wa lajnaa wa bismillaahi khorojnaa wa'alallohi robbina tawakkalnaa"),
            Doa_Harian("Doa Keluar Rumah / Doa Bepergian", "بِسْمِ اللهِ تَوَكَّلْتُ عَلَى اللهِ لاَحَوْلَ وَلاَقُوَّةَ اِلاَّ بِالله", "Bismillaahi tawakkaltu 'alalloohi laa hawlaa walaa quwwata illaa bilaahi"),
            Doa_Harian("Doa Ketika Bercermin", "اَلْحَمْدُ ِللهِ كَمَا حَسَّنْتَ خَلْقِىْ  فَحَسِّـنْ خُلُقِىْ", "Alhamdulillaahi kamaa hassanta kholqii fahassin khuluqii")
        )

        val adapter = DoaHarianAdapter(data)

        rvDoaActivity.adapter = adapter

        rvDoaActivity.layoutManager =
            LinearLayoutManager(
                this,
                LinearLayoutManager.VERTICAL, false
            )
    }
}