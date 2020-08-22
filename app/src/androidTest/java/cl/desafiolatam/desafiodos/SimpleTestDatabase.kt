package cl.desafiolatam.desafiodos

import android.app.Application
import androidx.room.Dao
import androidx.test.internal.runner.junit4.AndroidJUnit4Builder
import androidx.test.runner.AndroidJUnit4
import cl.desafiolatam.desafiodos.model.TaskRepository
import cl.desafiolatam.desafiodos.model.db.TaskDao
import org.junit.Before
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class SimpleTestDatabase {
    private lateinit var taskDao: TaskDao
    private lateinit var db: TaskRepository

    @Before
    fun createDb() {

    }


}