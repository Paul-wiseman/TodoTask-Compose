package com.example.todoapp.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import com.example.todoapp.util.Constants.LIST_SCREEN

fun NavGraphBuilder.listcomposable(
    navigateToTaskScreen: (Int) -> Unit
) {

    composable(
        route = LIST_SCREEN,
        arguments = listOf(
            navArgument(LIST_SCREEN) {
                type = NavType.StringType
            },
        )
    ) {

    }
}