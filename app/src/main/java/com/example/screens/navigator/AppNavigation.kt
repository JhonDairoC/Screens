package com.example.screens.navigator

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.screens.screens.FirtScreen
import com.example.screens.screens.SecondScreen
import com.example.screens.screens.TerScreen

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = AppScreens.FirtScreen.route)
    {
        composable(route = AppScreens.FirtScreen.route){
            FirtScreen(navController)
        }

        composable(route = AppScreens.SecondScreen.route){
            SecondScreen(navController)
        }

        composable(route = AppScreens.TerScreen.route){
            TerScreen(navController)
        }
    }
}