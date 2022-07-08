package com.example.hanacarakaproject.adapter

import android.view.LayoutInflater
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
        val itemBinding = WyanjanaListViewBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )

        return ViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int)
    {
        val data = listData[position]
        holder.bind(data)
    }

    override fun getItemCount(): Int = listData.size

    fun setData(data: List<Wyanjana>?)
    {
        if (data.isNullOrEmpty())
            return
        listData.clear()
        listData.addAll(data)
    }

    inner class ViewHolder(private val binds: WyanjanaListViewBinding) :
        RecyclerView.ViewHolder(binds.root)
    {
        fun bind(data: Wyanjana)
        {
            with(binds)
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