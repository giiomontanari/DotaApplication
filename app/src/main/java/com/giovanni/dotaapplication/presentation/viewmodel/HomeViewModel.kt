package com.giovanni.dotaapplication.presentation.viewmodel

import androidx.lifecycle.ViewModel
import com.giovanni.dotaapplication.domain.usecase.GetHeroes
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getHeroes: GetHeroes
) : ViewModel() {
}