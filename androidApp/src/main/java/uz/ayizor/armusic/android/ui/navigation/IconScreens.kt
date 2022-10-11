package uz.ayizor.armusic.android.ui.navigation

import uz.ayizor.armusic.android.theme.CustomIcons

sealed class IconScreens(val route: String, val label: String, val icon: Int) {

    //Bottom Nav
    object Home : IconScreens("home_screen_route", "Home", CustomIcons.HomeLine)
    object Favorites : IconScreens("favorites_screen_route", "Favorites", CustomIcons.HeartLine)
    object Playlists : IconScreens("playlist_screen_route", "Playlists", CustomIcons.ClipBoardLine)
    object Settings : IconScreens("settings_screen_route", "Settings", CustomIcons.SettingLine)
}