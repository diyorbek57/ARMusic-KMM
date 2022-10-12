package uz.ayizor.armusic.android.models

import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavItem(
    val name: String,
    val route: String,
    val default_icon: ImageVector,
    val selected_icon: ImageVector
)