package com.example.hanacarakaproject.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.example.hanacarakaproject.R
import com.example.hanacarakaproject.adapter.WyanjanaAdapter
import com.example.hanacarakaproject.databinding.ActivityWyanjanaBinding
import com.example.hanacarakaproject.dataclass.Wyanjana
import com.example.hanacarakaproject.viewmodel.MainViewModel

class WyanjanaActivity : AppCompatActivity()
{
    private lateinit var binds: ActivityWyanjanaBinding
    private lateinit var rvAdapter: WyanjanaAdapter

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binds = ActivityWyanjanaBinding.inflate(layoutInflater)
        setContentView(binds.root)

        supportActionBar?.title = getString(R.string.wyanjana)

        val viewmodel = ViewModelProvider(this)[MainViewModel(this.application)::class.java]
        val data = viewmodel.getListWyanjana()
        rvAdapter = WyanjanaAdapter(this@WyanjanaActivity)
        rvAdapter.setData(data)

        binds.apply {
            rvDictionary.layoutManager = GridLayoutManager(this@WyanjanaActivity, 2)
            rvDictionary.adapter = rvAdapter
            rvAdapter.setOnItemClickCallback(object : WyanjanaAdapter.OnItemClickCallback
            {
                override fun onItemClicked(data: Wyanjana)
                {
                    startActivity(Intent(this@WyanjanaActivity, DetailAksaraActivity::class.java)
                        .also {
                            it.putExtra(DetailAksaraActivity.EXT_SCRIPT, data.script)
                        })
                }
            })
        }
    }
}