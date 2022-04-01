package com.example.hanacarakaproject.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hanacarakaproject.R
import com.example.hanacarakaproject.databinding.ActivityKamusBinding

class KamusActivity : AppCompatActivity()
{
    private lateinit var binds : ActivityKamusBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binds = ActivityKamusBinding.inflate(layoutInflater)
        setContentView(binds.root)

        supportActionBar?.title = getString(R.string.kamus)
    }
}