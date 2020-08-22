package cl.desafiolatam.desafiodos.model.db

import androidx.lifecycle.LiveData
import androidx.room.*
import cl.desafiolatam.desafiodos.model.Task

@Dao
interface TaskDao {

    @Insert
    suspend fun insertTaskOnDatabase(task: Task)

    @Update
    suspend fun updateTaskOnDatabase(task: Task)

    @Delete
    suspend fun deleteTaskOnDatabase(task: Task)

    @Query("SELECT * FROM task_table")
    fun getAllTaskOnDatabase(): LiveData<List<Task>>

    @Query("DELETE FROM task_table")
    suspend fun deleteAllDataOnTable()

}