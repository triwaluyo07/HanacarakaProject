package com.example.hanacarakaproject.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.hanacarakaproject.data.AwakData
import com.example.hanacarakaproject.dataclass.Awak

class MainViewModel(app : Application) : AndroidViewModel(app)
{
    fun getListAwak() : List<Awak> = AwakData.generateDataAwak()
}