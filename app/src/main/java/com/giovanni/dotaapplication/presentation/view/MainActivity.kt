package com.giovanni.dotaapplication.presentation.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.giovanni.dotaapplication.commons.view.DotaScreen
import com.giovanni.dotaapplication.ui.theme.DotaApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DotaApplicationTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = DotaScreen.Home.name
                ) {
                    composable(DotaScreen.Home.name) {
                        HomeScreen()
                    }
                    composable(DotaScreen.Profile.name) {
                        ProfileScreen()
                    }
                }
            }
        }
    }
}