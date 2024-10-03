package com.example.todoapp.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.todoapp.data.models.ToDoTask
import com.example.todoapp.data.repository.ToDoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.launch

@HiltViewModel
class SharedViewModel(
    private val repository: ToDoRepository
) : ViewModel() {

    private val _allTasks = MutableSharedFlow<List<ToDoTask>>()
    val allTask: SharedFlow<List<ToDoTask>> = _allTasks

    fun getAllTask() = viewModelScope.launch {
        repository.getAllTasks.collect { todoTasks ->
            _allTasks.emit(todoTasks)
        }
    }


}