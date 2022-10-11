package uz.ayizor.armusic.android.ui.navigation

import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import uz.ayizor.armusic.android.theme.CustomIcons

@Composable
fun BottomAppNavBar(navController: NavHostController, bottomNavigationItems:List<IconScreens>) {
    BottomAppBar(
        backgroundColor = Color.White,
        contentColor = Color.Red,
        elevation = 10.dp,
    ) {
        bottomNavigationItems.forEach { screen ->
            val navBackStackEntry by navController.currentBackStackEntryAsState()
            val currentRoute = navBackStackEntry?.arguments?.getString(screen.route)

            BottomNavigationItem(
                icon = { Icon(imageVector = ImageVector.vectorResource(id =screen.icon), contentDescription = null) },
                selected = currentRoute == screen.route,
                onClick = {
                    navController.navigate(screen.route) {
                        popUpTo = navController.graph.startDestinationId
                        launchSingleTop = true
                    }
                }
            )
        }
    }

}