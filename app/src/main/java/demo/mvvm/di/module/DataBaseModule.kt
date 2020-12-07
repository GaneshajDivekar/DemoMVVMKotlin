package demo.mvvm.di.module

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import demo.mvvm.db.PokeDao
import demo.mvvm.db.PokemonDB
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
class DataBaseModule {

    @Provides
    @Singleton
    fun providePokemonDB(application: Application?): PokemonDB {
        return Room.databaseBuilder(application!!, PokemonDB::class.java, "Favorite Database")
            .fallbackToDestructiveMigration()
            .allowMainThreadQueries()
            .build()
    }

    @Provides
    @Singleton
    fun providePokeDao(pokemonDB: PokemonDB): PokeDao {
        return pokemonDB.pokeDao()!!
    }
}