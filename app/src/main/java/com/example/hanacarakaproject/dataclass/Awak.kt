package com.example.hanacarakaproject.dataclass

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Awak(
    val id: Int,
    val img: Int,
    val ngoko: String,
    val krama: String
) : Parcelable
