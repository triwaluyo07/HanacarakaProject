package com.example.hanacarakaproject.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.hanacarakaproject.data.AwakData
import com.example.hanacarakaproject.data.WyanjanaData
import com.example.hanacarakaproject.dataclass.Awak
import com.example.hanacarakaproject.dataclass.Wyanjana

class MainViewModel(app : Application) : AndroidViewModel(app)
{
    fun getListAwak() : List<Awak> = AwakData.generateDataAwak()

    fun getListWyanjana() : List<Wyanjana> = WyanjanaData.generateWyanjana()
}