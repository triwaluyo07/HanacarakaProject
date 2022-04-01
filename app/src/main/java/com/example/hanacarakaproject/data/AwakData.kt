package com.example.hanacarakaproject.data

import com.example.hanacarakaproject.R
import com.example.hanacarakaproject.dataclass.Awak

object AwakData
{
    fun generateDataAwak() : List<Awak>
    {
        val awak = ArrayList<Awak>()

        awak.add(
            Awak(
                1,
                R.drawable.gb_rambut,
                "Rambut",
                "Rikmo"
            )
        )
        awak.add(
            Awak(
                2,
                R.drawable.gb_kepala,
                "Sirah",
                "Mustaka"
            )
        )
        awak.add(
            Awak(
                3,
                R.drawable.gb_mata,
                "Mripat",
                "Soca"
            )
        )
        awak.add(
            Awak(
                4,
                R.drawable.gb_telinga,
                "Kuping",
                "Talingan"
            )
        )
        awak.add(
            Awak(
                5,
                R.drawable.gb_hidung,
                "Irung",
                "Grono"
            )
        )
        awak.add(
            Awak(
                6,
                R.drawable.gb_mulut,
                "Lambe",
                "Lathi"
            )
        )
        awak.add(
            Awak(
                7,
                R.drawable.gb_leher,
                "Gulu",
                "Jangga"
            )
        )
        awak.add(
            Awak(
                8,
                R.drawable.gb_tangan,
                "Tangan",
                "Asta"
            )
        )
        awak.add(
            Awak(
                9,
                R.drawable.gb_kaki,
                "Sikil",
                "Suku"
            )
        )
        awak.add(
            Awak(
                10,
                R.drawable.gb_ceker,
                "Dlamakan",
                "Samparan"
            )
        )

        return awak
    }
}