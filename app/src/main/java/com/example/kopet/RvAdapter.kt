package com.example.kopet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RvAdapter : RecyclerView.Adapter<RvAdapter.ViewHolder>() {

    private val kasus = arrayOf("123", "456", "69", "10")

    private val persentage = arrayOf("+10%", "+20%", "+30%", "+40%")

    private val provinsi = arrayOf("Jawa Barat", "DKI Jakarta", "Jawa Tengah", "Jawa Timur")

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var tvKasus: TextView
        var tvPersentage: TextView
        var tvProvinsi: TextView

        init {
            tvKasus = itemView.findViewById(R.id.tv_kasus)
            tvPersentage = itemView.findViewById(R.id.tv_persentage)
            tvProvinsi = itemView.findViewById(R.id.tv_provinsi)

        }


    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.item_rv, viewGroup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.tvKasus.text = kasus[i]
        viewHolder.tvPersentage.text = persentage[i]
        viewHolder.tvProvinsi.text = provinsi[i]
    }

    override fun getItemCount(): Int {
        return kasus.size
    }
}