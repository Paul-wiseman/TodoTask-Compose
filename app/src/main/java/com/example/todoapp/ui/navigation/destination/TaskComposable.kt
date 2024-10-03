package com.example.todoapp.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import com.example.todoapp.util.Constants.LIST_SCREEN
import com.example.todoapp.util.Constants.TASK_SCREEN

fun NavGraphBuilder.taskComposable(
    navigateToListScreen: (Action) -> Unit
) {

    composable(
        route = TASK_SCREEN,
        arguments = listOf(
            navArgument() {
                type = NavType.StringType
            },
        )
    ) {

    }
}