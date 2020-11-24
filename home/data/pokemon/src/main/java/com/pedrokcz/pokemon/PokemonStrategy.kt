package com.pedrokcz.pokemon

import com.pedrokcz.domain.entity.Monster
import com.pedrokcz.domain.repository.MonstersStrategy

class PokemonStrategy : MonstersStrategy {

    override fun getMonsters(): List<Monster> {
        return listOf(
            Monster("Bulbasaur", "https://pokeres.bastionbot.org/images/pokemon/1.png"),
            Monster("Ivysaur", "https://pokeres.bastionbot.org/images/pokemon/2.png"),
            Monster("Venusaur", "https://pokeres.bastionbot.org/images/pokemon/3.png"),
            Monster("Charmander", "https://pokeres.bastionbot.org/images/pokemon/4.png"),
            Monster("Charmeleon", "https://pokeres.bastionbot.org/images/pokemon/5.png"),
            Monster("Charizard", "https://pokeres.bastionbot.org/images/pokemon/6.png"),
            Monster("Squirtle", "https://pokeres.bastionbot.org/images/pokemon/7.png"),
            Monster("Wartortle", "https://pokeres.bastionbot.org/images/pokemon/8.png"),
            Monster("Blastoise", "https://pokeres.bastionbot.org/images/pokemon/9.png")
        )
    }
}
