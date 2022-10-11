package uz.ayizor.armusic.android.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost

import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import uz.ayizor.armusic.android.ui.screens.FavoritesScreen
import uz.ayizor.armusic.android.ui.screens.HomeScreen
import uz.ayizor.armusic.android.ui.screens.PlaylistScreen
import uz.ayizor.armusic.android.ui.screens.SettingsScreen

@Composable
fun MainNavigation() {

    val navController = rememberNavController()

    NavHost(navController, startDestination = "home_screen_route") {


        // Bottom Nav
        composable(IconScreens.Home.route) {
            HomeScreen(navController)
        }
        composable(IconScreens.Favorites.route) {
            FavoritesScreen(navController)
        }
        composable(IconScreens.Playlists.route) {
            PlaylistScreen(navController)
        }
        composable(IconScreens.Settings.route) {
            SettingsScreen(navController)
        }
    }
}