package com.example.hanacarakaproject.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.hanacarakaproject.databinding.ListViewBinding
import com.example.hanacarakaproject.dataclass.Awak
import com.example.hanacarakaproject.misc.ItemCallback

class AwakAdapter(private val callback : ItemCallback) : RecyclerView.Adapter<AwakAdapter.ViewHolder>()
{
    private val listData = ArrayList<Awak>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AwakAdapter.ViewHolder
    {
        val itemBinding = ListViewBinding.inflate(
            LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: AwakAdapter.ViewHolder, position: Int)
    {
        val data = listData[position]
        holder.bind(data)
    }

    override fun getItemCount(): Int = listData.size

    fun setData(data : List<Awak>?)
    {
        if (data.isNullOrEmpty())
            return
        listData.clear()
        listData.addAll(data)
    }

    inner class ViewHolder(private val binds: ListViewBinding) :
        RecyclerView.ViewHolder(binds.root)
    {
        @SuppressLint("SetTextI18n")
        fun bind(data: Awak)
        {
            with(binds)
            {
                Glide.with(itemView.context)
                    .load(data.img)
                    .into(awakImg)
                ngokoTxt.text = "Basa Ngoko : ${data.ngoko}"
                kramaTxt.text = "Basa Krama : ${data.krama}"
                cvAwak.setOnClickListener {
                    callback.onItemClicked(data)
                }
            }
        }
    }
}