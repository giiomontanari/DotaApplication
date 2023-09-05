package com.giovanni.dotaapplication.presentation.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.remember
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.giovanni.dotaapplication.commons.view.DotaScreen
import com.giovanni.dotaapplication.data.datasource.DotaDataSourceImpl
import com.giovanni.dotaapplication.data.repository.DotaRepositoryImpl
import com.giovanni.dotaapplication.domain.usecase.GetHeroes
import com.giovanni.dotaapplication.presentation.viewmodel.HomeViewModel
import com.giovanni.dotaapplication.ui.theme.DotaApplicationTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
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
                        val parentEntry = remember(it) {
                            navController.getBackStackEntry("Parent")
                        }
                        val dataSource = DotaDataSourceImpl()
                         val repository = DotaRepositoryImpl(
                             dataSource
                        )
                        val getHeroesUseCase = GetHeroes(
                            repository
                        )
                        val viewModel = hiltViewModel<HomeViewModel>(parentEntry)
                        HomeScreen(viewModel)
                    }
                    composable(DotaScreen.Profile.name) {
                        ProfileScreen()
                    }
                }
            }
        }
    }
}
