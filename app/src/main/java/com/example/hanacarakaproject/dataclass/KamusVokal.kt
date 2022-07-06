package com.example.hanacarakaproject.dataclass

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class KamusVokal(
    val id: Int,
    val name: String
): Parcelable