package uz.ayizor.armusic.android

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import uz.ayizor.armusic.android.models.BottomNavItem
import uz.ayizor.armusic.android.theme.*
import uz.ayizor.armusic.android.ui.screens.FavoritesScreen
import uz.ayizor.armusic.android.ui.screens.HomeScreen
import uz.ayizor.armusic.android.ui.screens.PlaylistScreen
import uz.ayizor.armusic.android.ui.screens.SettingsScreen


class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    @OptIn(ExperimentalMaterialApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme(darkTheme = false) {
                val navController = rememberNavController()
                Scaffold(
                    bottomBar = {
                        BottomNavigationBar(
                            items = listOf(
                                BottomNavItem(
                                    name = "Home",
                                    route = "home",
                                    default_icon = ImageVector.vectorResource(id = CustomIcons.HomeLine),
                                    selected_icon = ImageVector.vectorResource(id = CustomIcons.HomeBold)
                                ),
                                BottomNavItem(
                                    name = "Favorites",
                                    route = "favorites",
                                    default_icon = ImageVector.vectorResource(id = CustomIcons.HeartLine),
                                    selected_icon = ImageVector.vectorResource(id = CustomIcons.HeartBold)
                                ),
                                BottomNavItem(
                                    name = "Playlist",
                                    route = "playlist",
                                    default_icon = ImageVector.vectorResource(id = CustomIcons.ClipBoardLine),
                                    selected_icon = ImageVector.vectorResource(id = CustomIcons.ClipBoardBold)
                                ),
                                BottomNavItem(
                                    name = "Settings",
                                    route = "settings",
                                    default_icon = ImageVector.vectorResource(id = CustomIcons.SettingLine),
                                    selected_icon = ImageVector.vectorResource(id = CustomIcons.SettingBold)
                                ),
                            ),
                            navController = navController,
                            onItemClick = {
                                navController.navigate(it.route)
                            }
                        )
                    }
                ) {
                    Navigation(navController = navController)
                }
            }
        }
    }
}


@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen()
        }
        composable("favorites") {
            FavoritesScreen()
        }
        composable("playlist") {
            PlaylistScreen()
        }
        composable("settings") {
            SettingsScreen()
        }
    }
}

@ExperimentalMaterialApi
@Composable
fun BottomNavigationBar(
    items: List<BottomNavItem>,
    navController: NavController,
    modifier: Modifier = Modifier,
    onItemClick: (BottomNavItem) -> Unit
) {
    val backStackEntry = navController.currentBackStackEntryAsState()
    BottomNavigation(
        modifier = modifier,
        backgroundColor = Color.White,
        elevation = 5.dp
    ) {
        items.forEach { item ->
            val selected = item.route == backStackEntry.value?.destination?.route
            BottomNavigationItem(
                selected = selected,
                onClick = { onItemClick(item) },
                selectedContentColor = Orange900,
                unselectedContentColor = Gray500,
                icon = {
                    Column(horizontalAlignment = CenterHorizontally) {
                        if (selected){
                        Icon(
                            imageVector = item.selected_icon,
                            contentDescription = item.name
                        )
                        }else{
                            Icon(
                                imageVector = item.default_icon,
                                contentDescription = item.name
                            )
                        }
                    }
                }
            )
        }
    }
}




