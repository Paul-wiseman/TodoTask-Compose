package com.example.todoapp.util

import androidx.navigation.NavController

class Screens(navController: NavController) {
    val list:(Action) -> Unit = {action ->
        navController.navigate("list/${action.name}")
    }

}