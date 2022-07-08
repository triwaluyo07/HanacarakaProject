package com.example.hanacarakaproject.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
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
        binding.cardAbout.setOnClickListener {
            startActivity(Intent(this, AboutActivity::class.java))
        }

        binding.cardKamus.setOnClickListener {
            startActivity(Intent(this, WyanjanaActivity::class.java))
        }

        binding.cardPengetahuanumum.setOnClickListener {
            startActivity(Intent(this, PengetahuanUmumActivity::class.java))
        }
    }
}