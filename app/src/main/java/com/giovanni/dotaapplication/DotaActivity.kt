package com.giovanni.dotaapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.graphics.Color
import com.giovanni.dotaapplication.ui.theme.DotaSystemUi
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DotaActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DotaSystemUi(
                statusBarColor = Color(0xFFFFFFFF),
                navigationBarColor = Color(0xFFFFFFFF),
            )
            DotaApp()
        }
    }
}
