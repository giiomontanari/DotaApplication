package com.giovanni.dotaapplication.presentation.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.giovanni.dotaapplication.commons.view.DotaScreen
import com.giovanni.dotaapplication.commons.viewmodel.SampleViewModel
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
//                    navigation(
//                        startDestination = "home",
//                        route = "auth"
//                    ) {
//                        composable("home") {
//                            val viewModel =
//                                it.sharedViewModel<SampleViewModel>(navController = navController)
//                            ProfileScreen()
//                        }
//                    }
                    composable(DotaScreen.Home.name) {
                        val viewModel =
                            it.sharedViewModel<SampleViewModel>(navController = navController)
                        ProfileScreen()
                    }
                }
            }
        }
    }

    @Composable
    fun ProfileScreen() {
        /*...*/
        Text(text = "See friends list")
    }
}

@Composable
inline fun <reified T : ViewModel> NavBackStackEntry.sharedViewModel(navController: NavController): T {
    val navGraphRoute = destination.parent?.route ?: return viewModel()
    val parentEntry = remember(this) {
        navController.getBackStackEntry(navGraphRoute)
    }
    return viewModel(parentEntry)
}