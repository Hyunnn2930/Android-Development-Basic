package com.example.belajarandroidcuy.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidcuy.R
import com.example.belajarandroidcuy.model.Doa

class DoaAdapter (val data: ArrayList<Doa>)
    : RecyclerView.Adapter<DoaAdapter.DoaViewHolder>() {
    class DoaViewHolder(view: View) :
        RecyclerView.ViewHolder(view) {
        val ivdoa: ImageView = view.findViewById(R.id.ivGambarDoa)
        val tvdoa: TextView = view.findViewById(R.id.tvText)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoaViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_doa, parent, false)
        return DoaAdapter.DoaViewHolder(view)
    }

    override fun onBindViewHolder(holder: DoaViewHolder, position: Int) {
        val item = data.get(position)
        holder.tvdoa.text = item.nama
        holder.ivdoa.setImageResource(item.gambar)
    }

    override fun getItemCount(): Int = data.size

}