package com.example.hanacarakaproject.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.hanacarakaproject.databinding.WyanjanaListViewBinding
import com.example.hanacarakaproject.dataclass.Wyanjana
import com.example.hanacarakaproject.misc.ItemCallbackWyanjana

class WyanjanaAdapter(private val callback: ItemCallbackWyanjana) :
    RecyclerView.Adapter<WyanjanaAdapter.ViewHolder>()
{
    private val listData = ArrayList<Wyanjana>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder
    {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int)
    {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int = listData.size

    inner class ViewHolder(private val binds: WyanjanaListViewBinding) :
        RecyclerView.ViewHolder(binds.root)
    {
        fun bind (data: Wyanjana)
        {
            with (binds)
            {
                Glide.with(itemView.context)
                    .load(data.img)
                    .into(wyanjanaImg)
                wyanjanaTxt.text = data.script
                cardWyanjana.setOnClickListener {
                    callback.onClicked(data)
                }
            }
        }
    }
}