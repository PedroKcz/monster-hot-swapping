package com.pedrokcz.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pedrokcz.domain.entity.Monster
import com.pedrokcz.domain.repository.MonstersStrategy
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class HomeViewModel(
    private val strategy: MonstersStrategy
) : ViewModel() {

    val state: StateFlow<HomeViewState>
        get() = _state

    private val _state = MutableStateFlow(HomeViewState(listOf()))

    init {
        getMonstersData()
    }

    private fun getMonstersData() {
        viewModelScope.launch {
            _state.value = HomeViewState(strategy.getMonsters())
        }
    }
}

data class HomeViewState(
    val monsters: List<Monster>
)
