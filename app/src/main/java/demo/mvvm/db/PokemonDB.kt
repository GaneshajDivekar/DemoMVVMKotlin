package demo.mvvm.db

import androidx.room.Database
import androidx.room.RoomDatabase
import demo.mvvm.model.dao.Pokemon


@Database(entities = [Pokemon::class], version = 1, exportSchema = false)
abstract class PokemonDB : RoomDatabase() {
    abstract fun pokeDao(): PokeDao?
}