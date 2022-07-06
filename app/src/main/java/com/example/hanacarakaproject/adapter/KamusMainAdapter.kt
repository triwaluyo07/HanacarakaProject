package com.example.hanacarakaproject.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hanacarakaproject.databinding.MainKamusViewBinding
import com.example.hanacarakaproject.dataclass.KamusVokal
import com.example.hanacarakaproject.misc.ItemCallbackVokal

class KamusMainAdapter(private val callback: ItemCallbackVokal) :
    RecyclerView.Adapter<KamusMainAdapter.ViewHolder>()
{
    private val listData = ArrayList<KamusVokal>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder
    {
        val itemBinding = MainKamusViewBinding.inflate(
            LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int)
    {
        val data = listData[position]
        holder.bind(data)
    }

    override fun getItemCount(): Int = listData.size

    fun setData(data : List<KamusVokal>?)
    {
        if (data.isNullOrEmpty())
            return
        listData.clear()
        listData.addAll(data)
    }

    inner class ViewHolder(private val binds: MainKamusViewBinding) :
        RecyclerView.ViewHolder(binds.root)
    {
        fun bind (data: KamusVokal)
        {
            with(binds)
            {
                menuTxt.text = data.name
                cardViewContainer.setOnClickListener {
                    callback.onItemClicked(data)
                }
            }
        }
    }
}