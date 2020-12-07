package demo.mvvm.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import demo.mvvm.db.PokeDao
import demo.mvvm.model.dao.Pokemon
import demo.mvvm.network.APIService
import fieldtrak.kotlin.model.Example
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class MainRepository  @Inject constructor(private val apiHelper: APIService
                                          ,private val pokeDao: PokeDao) {
    var example = MutableLiveData<Example>()
    fun getResponse(
        city: String,
        s: String,
        s11: String,
        s21: String,
        s31: String,
        s41: String,
        s51: String,
        s61: String,
        s71: String,
        s81: String,
        s91: String
    ): MutableLiveData<Example> {
        apiHelper.getValidateLogin(city,s,s11,s21,s31,s41,s51,s61,s71,s81,s91)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread()).subscribe(
                { weather ->
                    example.postValue(weather)
                },
                { error ->
                    example.postValue(null)
                }
            )
    return example
    }

    fun insertData(pokemon: Pokemon) {
        pokeDao.insertData(pokemon)
    }

    fun getPokeman(): LiveData<List<Pokemon>> {
        return  pokeDao.getAll()
    }


}