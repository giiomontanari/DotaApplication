package com.giovanni.dotaapplication.presentation.view

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.giovanni.dotaapplication.presentation.viewmodel.HomeViewModel
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun HomeScreen(
    viewModel: HomeViewModel = viewModel()
) {
    /*...*/
    Text(text = "See Hero Dota list")
}