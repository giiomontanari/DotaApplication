package com.giovanni.dotaapplication.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.toFontFamily
import androidx.compose.ui.unit.sp
import com.giovanni.dotaapplication.ui.theme.font.DotaFontFamily


private val fontTypeLabel = TextStyle(
    fontFamily = DotaFontFamily.MONTSERRAT_SEMI_BOLD.toFontFamily(),
    fontSize = 11.sp,
    lineHeight = 16.sp,
    letterSpacing = 0.4.sp
)

private val body = TextStyle(
    fontFamily = DotaFontFamily.MONTSERRAT_MEDIUM.toFontFamily(),
    fontSize = 15.sp,
    lineHeight = 24.sp,
    letterSpacing = 0.4.sp
)

private val bodyLarge = TextStyle(
    fontFamily = DotaFontFamily.MONTSERRAT_BOLD.toFontFamily(),
    fontSize = 15.sp,
    lineHeight = 24.sp,
    letterSpacing = 0.4.sp
)

private val button = TextStyle(
    fontFamily = DotaFontFamily.MONTSERRAT_BOLD.toFontFamily(),
    fontSize = 12.sp,
    lineHeight = 16.sp,
    letterSpacing = 0.4.sp
)

private val header = TextStyle(
    fontFamily = DotaFontFamily.MONTSERRAT_SEMI_BOLD.toFontFamily(),
    fontSize = 13.sp,
    lineHeight = 16.sp,
    letterSpacing = 0.4.sp
)

@Immutable
class Typography(
    val label: TextStyle,
    val body: TextStyle,
    val bodyLarge: TextStyle,
    val button: TextStyle,
    val header: TextStyle,
)

val inPostTypography = Typography(
    label = fontTypeLabel,
    body = body,
    bodyLarge = bodyLarge,
    button = button,
    header = header,
)