package com.example.screens.navigator

sealed class AppScreens (val route: String){
    object FirtScreen: AppScreens(route = "firstScreen")
    object SecondScreen: AppScreens(route = "secondScreen")
    object TerScreen: AppScreens(route = "terScreen")
}