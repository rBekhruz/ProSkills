package com.example.instagram

import android.view.LayoutInflater
import android.view.View;
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Adapter : RecyclerView.Adapter<Adapter.ViewHolder>() {
    var list = listOf<history>()

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val username: TextView
        private val avatar1: ImageView

        init {
            username = itemView.findViewById(R.id.text4)
            avatar1 = itemView.findViewById(R.id.image2)
        }

        fun bind(history: history) {
            username.text = history.username
            Glide
                .with(itemView.context)
                .load(history.avatar1)
                .into(avatar1)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflate = LayoutInflater.from(parent.context)

        val view = inflate.inflate(R.layout.item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size

}