package cl.desafiolatam.desafiodos.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import cl.desafiolatam.desafiodos.model.Task
import cl.desafiolatam.desafiodos.model.TaskRepository
import cl.desafiolatam.desafiodos.model.db.TaskDataBase
import kotlinx.coroutines.launch

class TaskViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: TaskRepository
    val allTask: LiveData<List<Task>>

    init {
        val taskDao = TaskDataBase.getDatabase(application).getTaskDao()
        repository = TaskRepository(taskDao)
        allTask = repository.allTaskFromDatabase
    }

    fun insert(task: Task) = viewModelScope.launch{
        repository.insert(task)
    }

    fun update(task: Task) = viewModelScope.launch {
        repository.update(task)
    }

    fun delete(task: Task) = viewModelScope.launch {
        repository.delete(task)
    }

    fun deleteAll() = viewModelScope.launch {
        repository.deleteAll()
    }

}