package ru.zatsoft.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val clothes:MutableList<Clothes>):
    RecyclerView.Adapter<CustomAdapter.ClothesViewHolder>() {


    class ClothesViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val image: ImageView = itemView.findViewById(R.id.item_image)
        val title: TextView = itemView.findViewById(R.id.item_title)
        val description: TextView = itemView.findViewById(R.id.item_description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClothesViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ClothesViewHolder(itemView)
    }

    override fun getItemCount() = clothes.size

    override fun onBindViewHolder(holder: ClothesViewHolder, position: Int) {
        val cloth = clothes[position]
        holder.image.setImageResource(cloth.image)
        holder.title.text = cloth.name
        holder.description.text = cloth.description
    }
}