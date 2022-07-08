package com.example.hanacarakaproject.activity

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.example.hanacarakaproject.R
import com.example.hanacarakaproject.adapter.VocalAdapter
import com.example.hanacarakaproject.databinding.ActivityKamusBinding
import com.example.hanacarakaproject.dataclass.KamusVokal
import com.example.hanacarakaproject.misc.GridAutoFitLayoutManager
import com.example.hanacarakaproject.misc.ItemCallbackVokal
import com.example.hanacarakaproject.viewmodel.MainViewModel

class KamusActivity : AppCompatActivity(), ItemCallbackVokal
{
    private lateinit var binds : ActivityKamusBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binds = ActivityKamusBinding.inflate(layoutInflater)
        setContentView(binds.root)

        supportActionBar?.title = getString(R.string.kamus)

        val viewmodel = ViewModelProvider(this)
            .get(MainViewModel(this.application)::class.java)
        val data = viewmodel.getListVokal()
        val adapter = VocalAdapter(this)
        adapter.setData(data)

        with(binds.rvVocal) {
            val orientation = resources.configuration.orientation
            if (orientation == Configuration.ORIENTATION_LANDSCAPE)
                layoutManager = GridLayoutManager(this@KamusActivity, 6)
            else
                layoutManager = GridLayoutManager(this@KamusActivity, 4)
            this.adapter = adapter
        }
    }

    override fun onItemClicked(data: KamusVokal)
    {
        startActivity(Intent(this, WyanjanaActivity::class.java))
    }
}