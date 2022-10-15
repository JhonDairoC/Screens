package com.example.screens.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.screens.navigator.AppScreens

@Composable
fun SecondScreen(navController: NavController){
    Scaffold(
        topBar = {
            TopAppBar() {
                Icon(imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Arrow Back",
                    modifier = Modifier.clickable {
                        navController.popBackStack()
                    }
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "Segunda pantalla")
            }
        }
    ) {
        SeconBody(navController)
    }
}

@Composable
fun SeconBody(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Segunda pantalla")
        Button(onClick = {navController.navigate(route = AppScreens.FirtScreen.route)}) {
            Text(text = "Primera Pantalla")
        }
        Button(onClick = {navController.navigate(route = AppScreens.TerScreen.route)}) {
            Text(text = "Tercera pantalla")
        }
    }
}