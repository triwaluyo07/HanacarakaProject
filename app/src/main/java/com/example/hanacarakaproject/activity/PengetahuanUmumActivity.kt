package com.example.hanacarakaproject.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hanacarakaproject.R
import com.example.hanacarakaproject.adapter.AwakAdapter
import com.example.hanacarakaproject.databinding.ActivityPengetahuanumumBinding
import com.example.hanacarakaproject.dataclass.Awak
import com.example.hanacarakaproject.misc.ItemCallback
import com.example.hanacarakaproject.viewmodel.MainViewModel

class PengetahuanUmumActivity : AppCompatActivity(), ItemCallback
{
    private lateinit var binds: ActivityPengetahuanumumBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binds = ActivityPengetahuanumumBinding.inflate(layoutInflater)
        setContentView(binds.root)

        supportActionBar?.title = getString(R.string.pngthn_tmbh)

        val viewmodel = ViewModelProvider(this)
            .get(MainViewModel(this.application)::class.java)
        val data = viewmodel.getListAwak()
        val adapter = AwakAdapter(this)
        adapter.setData(data)

        with(binds.rvAwak) {
            layoutManager = LinearLayoutManager(context)
            this.adapter = adapter
        }
    }

    override fun onItemClicked(data: Awak)
    {
        Toast.makeText(
            this, "${data.ngoko}, ${data.krama}", Toast.LENGTH_SHORT
        ).show()
    }
}