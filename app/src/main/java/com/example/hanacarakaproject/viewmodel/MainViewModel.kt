package com.example.hanacarakaproject.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.hanacarakaproject.data.AwakData
import com.example.hanacarakaproject.data.VokalData
import com.example.hanacarakaproject.dataclass.Awak
import com.example.hanacarakaproject.dataclass.KamusVokal

class MainViewModel(app : Application) : AndroidViewModel(app)
{
    fun getListAwak() : List<Awak> = AwakData.generateDataAwak()

    fun getListVokal() : List<KamusVokal> = VokalData.generateVokal()
}