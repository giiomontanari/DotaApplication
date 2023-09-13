package com.giovanni.dotaapplication.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.giovanni.dotaapplication.core.commons.State
import com.giovanni.dotaapplication.data.model.Hero
import com.giovanni.dotaapplication.domain.usecase.GetHeroes
import com.giovanni.dotaapplication.presentation.mapper.DotaHomeMapper
import com.giovanni.dotaapplication.presentation.model.HeroUiModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getHeroes: GetHeroes,
    private val mapper: DotaHomeMapper
) : ViewModel() {

    private val _dotaState = MutableStateFlow<State<List<HeroUiModel>>>(State.Loading)
    val dotaState = _dotaState.asStateFlow()

    init {
        fetchHeroes()
    }

    fun fetchHeroes() = viewModelScope.launch {
        flow {
            emit(getHeroes.invoke())
        }.map {
            mapper.mapFrom(it)
        }.onStart {
            _dotaState.value = State.Loading
        }.catch {
            _dotaState.value = State.Error
        }.collectLatest {
            _dotaState.value = State.Success(it)
        }
    }
}
