package uz.ayizor.armusic.android.theme

import android.annotation.SuppressLint
import androidx.compose.material.lightColors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
@SuppressLint("ConflictingOnColor")
private val LightThemeColors = lightColors(
    primary = Orange900,
    primaryVariant = Orange900,
    onPrimary = Gray900,
    secondary = Color.White,
    secondaryVariant = Gray500,
    onSecondary = Gray900,
    error = Red700,
    onError = Red400,
    background = Color.White,
    onBackground = Color.Black,
    surface = Color.White,
    onSurface = Gray900,
)

private val DarkThemeColors = darkColors(
    primary = Orange900,
    primaryVariant = Color.White,
    onPrimary = Color.White,
    secondary = Orange900,
    onSecondary = Color.White,
    error = Red400,
    background = Gray900,
    onBackground = Color.White,
    surface = Orange900,
    onSurface = Color.White,
)

@Composable
fun AppTheme(
    darkTheme: Boolean,
    content: @Composable () -> Unit,
) {
    MaterialTheme(
        colors = if (darkTheme) DarkThemeColors else LightThemeColors,
    ){
        content()
    }
}