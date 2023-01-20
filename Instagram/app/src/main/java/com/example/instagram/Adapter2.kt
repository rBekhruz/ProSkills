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

class Adapter2 : RecyclerView.Adapter<Adapter2.ViewHolder2>() {
    var list2 = listOf<post>()

    inner class ViewHolder2(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val username2: TextView
        private val username3: TextView
        private val avatar2: ImageView
        private val description:TextView
        private val post: ImageView

        init {
            username2 = itemView.findViewById(R.id.text5)
            post = itemView.findViewById(R.id.image8)
            username3 = itemView.findViewById(R.id.text3)
            avatar2 = itemView.findViewById(R.id.image3)
            description = itemView.findViewById(R.id.text6)
        }

        fun bind(post: post) {
            username2.text = post.username2
            username3.text = post.username3
            description.text = post.description
            Glide
                .with(itemView.context)
                .load(post.post)
                .into(this.post)
            Glide
                .with(itemView.context)
                .load(post.avatar2)
                .into(avatar2)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder2 {
        val inflate = LayoutInflater.from(parent.context)

        val view = inflate.inflate(R.layout.item2, parent, false)
        return ViewHolder2(view)
    }

    override fun onBindViewHolder(holder: ViewHolder2, position: Int) {
        holder.bind(list2[position])
    }

    override fun getItemCount(): Int = list2.size


}
