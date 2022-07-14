package com.example.hanacarakaproject.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.hanacarakaproject.R
import com.example.hanacarakaproject.activity.DetailAksaraActivity
import com.example.hanacarakaproject.databinding.WyanjanaListViewBinding
import com.example.hanacarakaproject.dataclass.Wyanjana

class WyanjanaAdapter(private val context: Context) :
    RecyclerView.Adapter<WyanjanaAdapter.ViewHolder>()
{
    private val listData = ArrayList<Wyanjana>()
    private lateinit var onItemClickCallback: OnItemClickCallback

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder
    {
        return ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.wyanjana_list_view, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int)
    {
        val data = listData[position]
        holder.binds.apply {
            Glide.with(holder.itemView.context)
                .load(data.img)
                .into(wyanjanaImg)
            wyanjanaTxt.text = data.script
        }

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(data)
        }
    }

    override fun getItemCount(): Int = listData.size

    fun setData(data: List<Wyanjana>?)
    {
        if (data.isNullOrEmpty())
            return
        listData.clear()
        listData.addAll(data)
    }

    inner class ViewHolder(v: View) :
        RecyclerView.ViewHolder(v)
    {
        val binds = WyanjanaListViewBinding.bind(v)
    }

    interface OnItemClickCallback
    {
        fun onItemClicked(data: Wyanjana)
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback)
    {
        this.onItemClickCallback = onItemClickCallback
    }
}