package com.giovanni.dotaapplication

import androidx.compose.runtime.Composable
import com.giovanni.dotaapplication.presentation.view.HomeScreen
import com.giovanni.dotaapplication.ui.theme.DotaTheme

@Composable
fun DotaApp() {
    DotaTheme {
        HomeScreen()
    }
}