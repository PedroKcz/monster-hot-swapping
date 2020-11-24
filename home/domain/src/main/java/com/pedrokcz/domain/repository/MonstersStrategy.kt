package com.pedrokcz.domain.repository

import com.pedrokcz.domain.entity.Monster

interface MonstersStrategy {
    fun getMonsters(): List<Monster>
}
