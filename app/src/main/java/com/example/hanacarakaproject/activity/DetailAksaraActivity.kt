package com.example.hanacarakaproject.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.hanacarakaproject.databinding.ActivityDetailAksaraBinding
import com.example.hanacarakaproject.dataclass.AksaraDetail

class DetailAksaraActivity : AppCompatActivity()
{
    private lateinit var binds : ActivityDetailAksaraBinding
    private lateinit var data : ArrayList<AksaraDetail>

    companion object
    {
        const val EXT_SCRIPT = "EXT_SCRIPT"
    }

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binds = ActivityDetailAksaraBinding.inflate(layoutInflater)
        setContentView(binds.root)

        val script = intent.getStringExtra(EXT_SCRIPT)

        supportActionBar?.title = script
    }
}