package com.fers.oxentesushiapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.fers.oxentesushiapplication.R

class ItemMenuAdapter(
    private val itemlist : List<String>
) : RecyclerView.Adapter<ItemMenuAdapter.ItemMenuViewHolder>(){

    inner class ItemMenuViewHolder(itemView: View): ViewHolder(itemView){
        val imageView5_: ImageView
        val textDescricao : TextView
        val textView_preco : TextView

       init {
            imageView5_ = itemView.findViewById(R.id.imageView5_combo2)
            textDescricao = itemView.findViewById(R.id.textDescricao)
            textView_preco = itemView.findViewById(R.id.textView_preco2)
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemMenuViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context);
        val itemView = layoutInflater.inflate(R.layout.recycler_view_item, parent, false);
        return ItemMenuViewHolder(itemView);
    }

    override fun getItemCount(): Int {
        return itemlist.size;
    }

    override fun onBindViewHolder(holder: ItemMenuViewHolder, position: Int) {
        val descricao = itemlist[position]
        holder.itemView.findViewById<TextView>(R.id.textDescricao).text = descricao
    }

}

