package com.example.todoapp.ui.navigation.destination

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import com.example.todoapp.util.Action
import com.example.todoapp.util.Constants.TASK_ARGUMENT_KEY
import com.example.todoapp.util.Constants.TASK_SCREEN

fun NavGraphBuilder.taskComposable(
    navigateToListScreen: (Action) -> Unit
) {

    composable(
        route = TASK_SCREEN,
        arguments = listOf(
            navArgument(TASK_ARGUMENT_KEY) {
                type = NavType.IntType
            },
        )
    ) {

    }
}