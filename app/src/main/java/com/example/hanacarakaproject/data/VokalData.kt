package com.example.hanacarakaproject.data

import com.example.hanacarakaproject.dataclass.KamusVokal

object VokalData
{
    fun generateVokal() : List<KamusVokal>
    {
        val vokal = ArrayList<KamusVokal>()

        vokal.add(
            KamusVokal(
                1,
                "a"
            )
        )
        vokal.add(
            KamusVokal(
                2,
                "i"
            )
        )
        vokal.add(
            KamusVokal(
                3,
                "u"
            )
        )
        vokal.add(
            KamusVokal(
                4,
                "e"
            )
        )
        vokal.add(
            KamusVokal(
                5,
                "é"
            )
        )
        vokal.add(
            KamusVokal(
                6,
                "o"
            )
        )

        return vokal
    }
}