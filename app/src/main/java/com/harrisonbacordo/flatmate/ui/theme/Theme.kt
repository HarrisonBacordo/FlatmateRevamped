package com.harrisonbacordo.flatmate.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColorPalette = lightColorScheme(
    primary = flatMateBlue,
    onPrimary = grey50,
    secondary = flatMateBlue,
    onSecondary = grey50,
    error = red500,
    onError = grey50,
    surface = grey50,
    onSurface = grey900,
    background = grey50,
    onBackground = grey900,
)

private val DarkColorPalette = darkColorScheme(
    primary = flatMateBlue,
    onPrimary = grey50,
    secondary = flatMateBlue,
    onSecondary = grey50,
    error = red500,
    onError = grey50,
    surface = grey800,
    onSurface = grey50,
    background = grey900,
    onBackground = grey50
)

private val AuthColorPalette = lightColorScheme(
    primary = grey50,
    onPrimary = flatMateBlue,
    secondary = flatMateBlue,
    onSecondary = grey50,
    error = red500,
    onError = grey50,
    surface = flatMateBlue,
    onSurface = grey50,
    background = flatMateBlue,
    onBackground = grey50
)

private val OnboardingColorPalette = lightColorScheme(
    primary = grey50,
    onPrimary = flatMateBlue,
    secondary = flatMateBlue,
    onSecondary = grey50,
    error = red500,
    onError = grey50,
    surface = flatMateBlue,
    onSurface = grey50,
    background = flatMateBlue,
    onBackground = grey50
)

@Composable
fun FlatMateHomeTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }
    MaterialTheme(
        colorScheme = colors,
        typography = typography,
        shapes = shapes,
        content = content
    )
}

@Composable
fun FlatmateAuthTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = AuthColorPalette,
        typography = typography,
        shapes = shapes,
        content = content
    )
}

@Composable
fun FlatmateOnboardingTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = OnboardingColorPalette,
        typography = typography,
        shapes = shapes,
        content = content
    )
}
