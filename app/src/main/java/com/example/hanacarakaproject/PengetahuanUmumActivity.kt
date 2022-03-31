package com.example.hanacarakaproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hanacarakaproject.databinding.ActivityPengetahuanumumBinding

class PengetahuanUmumActivity : AppCompatActivity()
{
    private lateinit var binds : ActivityPengetahuanumumBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binds = ActivityPengetahuanumumBinding.inflate(layoutInflater)
        setContentView(binds.root)

        supportActionBar?.title = getString(R.string.pngthn_tmbh)
    }
}