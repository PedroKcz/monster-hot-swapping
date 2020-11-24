package com.pedrokcz.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pedrokcz.domain.entity.Monster
import com.pedrokcz.domain.repository.MonstersStrategy
import kotlinx.coroutines.launch

class HomeViewModel(
    private val strategy: MonstersStrategy
) : ViewModel() {

    val monstersList = MutableLiveData<List<Monster>>()

    init {
        getMonstersData()
    }

    private fun getMonstersData() {
        viewModelScope.launch {
            monstersList.value = strategy.getMonsters()
        }
    }
}
