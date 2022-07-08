package com.example.hanacarakaproject.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hanacarakaproject.R
import com.example.hanacarakaproject.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity()
{
    private lateinit var binds : ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binds = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binds.root)

        supportActionBar?.title = getString(R.string.about)
    }
}