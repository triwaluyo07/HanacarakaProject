package com.example.hanacarakaproject.dataclass

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class AksaraDetail(
    val id: Int,
    val vocal: Char,
    val img: String,
    val script: String,
    val pronounce: String
) : Parcelable