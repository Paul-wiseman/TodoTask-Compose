package com.example.todoapp.data.repository

import com.example.todoapp.data.ToDoDao
import com.example.todoapp.data.models.ToDoTask
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@ViewModelScoped
class ToDoRepository @Inject constructor(val toDoDao: ToDoDao) {

    val getAllTasks: Flow<List<ToDoTask>> = toDoDao.getAllTask()
    val sortByLowPriority: Flow<List<ToDoTask>> = toDoDao.sortByLowPriority()
    val sortByLHighPriority: Flow<List<ToDoTask>> = toDoDao.sortByHighPriority()

    fun getSelectedTask(taskId: Int): Flow<ToDoTask> = toDoDao.getSelectTask(taskId)

    suspend fun addTask(todoTask: ToDoTask) = toDoDao.addTask(todoTask)

    suspend fun updateTask(todoTask:ToDoTask) = toDoDao.updateTask(todoTask)

    suspend fun deleteTask(todoTask:ToDoTask) = toDoDao.deleteTask(todoTask)

    suspend fun deleteAllTask() = toDoDao.deleteAllTasks()

    fun searchDatabase(searchQuery:String) = toDoDao.searchDatabase(searchQuery)

}