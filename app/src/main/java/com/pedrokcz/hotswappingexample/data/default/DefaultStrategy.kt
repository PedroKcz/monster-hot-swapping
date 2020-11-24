package com.pedrokcz.hotswappingexample.data.default

import com.pedrokcz.hotswappingexample.domain.entity.Monster
import com.pedrokcz.hotswappingexample.domain.repository.MonstersStrategy

class DefaultStrategy : MonstersStrategy {

    override fun getMonsters(): List<Monster> {
        val image =
            "https://img2.gratispng.com/20180808/sk/kisspng-french-fries-baked-potato-potato-chip-stuffing-potato-png-free-png-images-toppng-5b6ae7aa27de93.5076901815337327781633.jpg"
        return listOf(
            Monster("P", image),
            Monster("O", image),
            Monster("T", image),
            Monster("A", image),
            Monster("T", image),
            Monster("O", image),
            Monster("E", image),
            Monster("S", image)
        )
    }
}