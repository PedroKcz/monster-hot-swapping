package com.pedrokcz.hotswappingexample.domain.repository

import com.pedrokcz.hotswappingexample.domain.entity.Monster

interface MonstersStrategy {
    fun getMonsters(): List<Monster>
}
