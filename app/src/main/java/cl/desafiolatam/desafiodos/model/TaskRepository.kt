package cl.desafiolatam.desafiodos.model

import androidx.lifecycle.LiveData
import cl.desafiolatam.desafiodos.model.db.TaskDao

/**
 * This is the repository, this class manage the data and pass it to viewModel
 */
class TaskRepository(private val taskDao: TaskDao) {

    val allTaskFromDatabase: LiveData<List<Task>> = taskDao.getAllTaskOnDatabase()

    suspend fun insert(task: Task) {
        taskDao.insertTaskOnDatabase(task)
    }

    suspend fun update(task: Task) {
        taskDao.updateTaskOnDatabase(task)
    }

    suspend fun delete(task: Task) {
        taskDao.deleteTaskOnDatabase(task)
    }

    suspend fun deleteAll(){
        taskDao.deleteAllDataOnTable()
    }

}