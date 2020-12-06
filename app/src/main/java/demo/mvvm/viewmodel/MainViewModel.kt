package demo.mvvm.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mindorks.framework.mvvm.utils.NetworkHelper
import demo.mvvm.repository.MainRepository
import fieldtrak.kotlin.model.Example

class MainViewModel  @ViewModelInject constructor(
    private val mainRepository: MainRepository,
    private val networkHelper: NetworkHelper
) :ViewModel(){
    fun getData(
        city: String,
        s: String,
        s1: String,
        s2: String,
        s3: String,
        s4: String,
        s5: String,
        s6: String,
        s7: String,
        s8: String,
        s9: String
    ): MutableLiveData<Example> {
        return mainRepository.getResponse(city,s,s1,s2,s3,s4,s5,s6,s7,s8,s9)
    }

}