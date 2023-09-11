package com.giovanni.dotaapplication.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
@Composable
fun DotaTheme(
    content: @Composable () -> Unit,
) {
    MaterialTheme(content = content)
}

object DotaTheme {
    val typography: Typography
        @Composable
        get() = inPostTypography
}