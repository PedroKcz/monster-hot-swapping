package com.pedrokcz.digimon

import com.pedrokcz.domain.entity.Monster
import com.pedrokcz.domain.repository.MonstersStrategy

class DigimonStrategy : MonstersStrategy {

    override fun getMonsters(): List<Monster> {
        return listOf(
            Monster("Koromon", "https://digimon.shadowsmith.com/img/koromon.jpg"),
            Monster("Tsunomon", "https://digimon.shadowsmith.com/img/tsunomon.jpg"),
            Monster("Yokomon", "https://digimon.shadowsmith.com/img/yokomon.jpg"),
            Monster("Motimon", "https://digimon.shadowsmith.com/img/motimon.jpg"),
            Monster("Tanemon", "https://digimon.shadowsmith.com/img/tanemon.jpg"),
            Monster("Bukamon", "https://digimon.shadowsmith.com/img/bukamon.jpg"),
            Monster("Tokomon", "https://digimon.shadowsmith.com/img/tokomon.jpg"),
            Monster("Agumon", "https://digimon.shadowsmith.com/img/agumon.jpg"),
            Monster("Gabumon", "https://digimon.shadowsmith.com/img/gabumon.jpg"),
            Monster("Biyomon", "https://digimon.shadowsmith.com/img/biyomon.jpg")
        )
    }
}
