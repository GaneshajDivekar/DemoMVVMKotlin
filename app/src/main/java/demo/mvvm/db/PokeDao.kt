package demo.mvvm.db

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import demo.mvvm.model.dao.Pokemon

@Dao
interface PokeDao {

    @Insert
    fun insertData(pokemon: Pokemon)

    @Query("SELECT * FROM favorite_table")
    fun getAll(): LiveData<List<Pokemon>>

}