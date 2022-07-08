package com.example.hanacarakaproject.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hanacarakaproject.databinding.VocalListViewBinding
import com.example.hanacarakaproject.dataclass.KamusVokal
import com.example.hanacarakaproject.misc.ItemCallbackVokal

class VocalAdapter (private val callback: ItemCallbackVokal) :
    RecyclerView.Adapter<VocalAdapter.ViewHolder>()
{
    private val listData = ArrayList<KamusVokal>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder
    {
        val itemBinding = VocalListViewBinding.inflate(
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

    inner class ViewHolder (private val binds: VocalListViewBinding) :
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