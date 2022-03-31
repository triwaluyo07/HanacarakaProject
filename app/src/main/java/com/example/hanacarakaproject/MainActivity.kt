package com.example.hanacarakaproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hanacarakaproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()
{
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        intentActivity()
    }

    private fun intentActivity()
    {
        binding.cardKamus.setOnClickListener {
            startActivity(Intent(this, KamusActivity::class.java))
        }

        binding.cardPengetahuanumum.setOnClickListener {
            startActivity(Intent(this, PengetahuanUmumActivity::class.java))
        }
    }
}