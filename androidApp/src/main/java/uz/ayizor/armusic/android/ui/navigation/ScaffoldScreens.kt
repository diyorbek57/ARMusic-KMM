package uz.ayizor.armusic.android.ui.navigation

import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ScaffoldScreen(navController: NavHostController, screen: @Composable () -> Unit){

    val bottomNavigationItems = listOf(
        IconScreens.Home,
        IconScreens.Favorites,
        IconScreens.Playlists,
        IconScreens.Settings
    )


    Scaffold(topBar = {},
        bottomBar = {BottomAppNavBar(navController, bottomNavigationItems)},
        content = { screen() }
    )
}