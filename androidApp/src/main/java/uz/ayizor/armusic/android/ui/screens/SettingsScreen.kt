package uz.ayizor.armusic.android.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.navigation.NavHostController
import uz.ayizor.armusic.android.ui.navigation.ScaffoldScreen

@Composable
fun SettingsScreen(navController: NavHostController) {
    ScaffoldScreen(navController) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "Library Screen")
        }
    }
}