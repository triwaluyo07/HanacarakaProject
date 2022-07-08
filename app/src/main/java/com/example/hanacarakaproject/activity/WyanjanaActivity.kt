package com.example.hanacarakaproject.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.example.hanacarakaproject.R
import com.example.hanacarakaproject.adapter.WyanjanaAdapter
import com.example.hanacarakaproject.databinding.ActivityWyanjanaBinding
import com.example.hanacarakaproject.dataclass.Wyanjana
import com.example.hanacarakaproject.misc.ItemCallbackWyanjana
import com.example.hanacarakaproject.viewmodel.MainViewModel

class WyanjanaActivity : AppCompatActivity(), ItemCallbackWyanjana
{
    private lateinit var binds: ActivityWyanjanaBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binds = ActivityWyanjanaBinding.inflate(layoutInflater)
        setContentView(binds.root)

        supportActionBar?.title = getString(R.string.wyanjana)

        val viewmodel = ViewModelProvider(this)[MainViewModel(this.application)::class.java]
        val data = viewmodel.getListWyanjana()
        val adapter = WyanjanaAdapter(this)
        adapter.setData(data)

        with(binds.rvDictionary) {
            layoutManager = GridLayoutManager(this@WyanjanaActivity, 2)
            this.adapter = adapter
        }
    }

    override fun onClicked(data: Wyanjana)
    {
        Toast.makeText(this, data.script, Toast.LENGTH_SHORT)
            .show()
    }
}