package com.example.hanacarakaproject.dataclass

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Wyanjana (
    val id: Int,
    val img: Int,
    val script: String
): Parcelable