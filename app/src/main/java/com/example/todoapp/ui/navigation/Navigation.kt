package com.example.todoapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.todoapp.ui.navigation.destination.listcomposable
import com.example.todoapp.ui.navigation.destination.taskComposable
import com.example.todoapp.util.Constants.LIST_SCREEN

@Composable
fun SetupNavigation(
    navController:NavHostController
){
    val screens = remember(navController) {
        Screens(navController = navController)
    }


    NavHost(
        navController = navController,
        startDestination = LIST_SCREEN
    ){

        listcomposable(
            navigateToTaskScreen = screens.task
        )

        taskComposable(navigateToListScreen = screens.list)
    }
}