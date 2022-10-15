package com.example.screens.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.screens.navigator.AppScreens

@Composable
fun FirtScreen(navController: NavController){
    Scaffold(
        topBar = {
            TopAppBar() {
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "Primer pantalla")
            }
        }
    ) {
        Body(navController)
    }
}

@Composable
fun Body(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "")
        Button(onClick = {
            navController.navigate(route = AppScreens.SecondScreen.route)
        }) {
            Text(text = "Segunda pantalla")
        }
        Button(onClick = {navController.navigate(route = AppScreens.TerScreen.route)}) {
            Text(text = "Tercera pantalla")
        }
    }
}