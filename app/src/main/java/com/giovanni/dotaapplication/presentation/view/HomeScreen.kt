package com.giovanni.dotaapplication.presentation.view

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.giovanni.dotaapplication.presentation.viewmodel.HomeViewModel

@Composable
fun HomeScreen(
    viewModel: HomeViewModel = hiltViewModel()
) {
    /*...*/
    Text(text = "See Hero Dota list")
}