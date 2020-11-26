package com.pedrokcz.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pedrokcz.domain.repository.MonstersStrategy
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class HomeViewModel(
    private val strategy: MonstersStrategy
) : ViewModel() {

    private val _state = MutableStateFlow(HomeState(listOf()))
    val state: StateFlow<HomeState> = _state

    fun interact(event: HomeEvent) {
        when (event) {
            HomeEvent.Opened -> fetchMonsters()
        }
    }

    private fun fetchMonsters() = viewModelScope.launch {
        _state.value = HomeState(strategy.getMonsters())
    }
}
