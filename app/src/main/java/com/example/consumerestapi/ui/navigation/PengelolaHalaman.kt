package com.example.consumerestapi.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.consumerestapi.ui.view.DestinasiEntry
import com.example.consumerestapi.ui.view.DestinasiHome
import com.example.consumerestapi.ui.view.EntryMhsScreen
import com.example.consumerestapi.ui.view.HomeScreen

@Composable
fun PengelolaHalaman(navController: NavHostController = rememberNavController()) {
    NavHost(
        navController = navController,
        startDestination = DestinasiHome.route,
        modifier = Modifier
    ) {
        composable(
            route = DestinasiHome.route
        ){
            HomeScreen(
                navigateToItemEntry = { navController.navigate(DestinasiEntry.route) },
                onDetailClick = {}
            )
        }
        composable(
            route = DestinasiEntry.route
        ){
            EntryMhsScreen(
                navigateBack = {
                    navController.navigate(DestinasiHome.route) {
                        popUpTo(DestinasiHome.route) { inclusive = true }
                    }
                }
            )
        }
    }
}
