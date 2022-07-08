package com.example.hanacarakaproject.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hanacarakaproject.R
import com.example.hanacarakaproject.databinding.ActivityWyanjanaBinding

class WyanjanaActivity : AppCompatActivity()
{
    private lateinit var binds : ActivityWyanjanaBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binds = ActivityWyanjanaBinding.inflate(layoutInflater)
        setContentView(binds.root)

        supportActionBar?.title = getString(R.string.vokal)
    }
}