package demo.mvvm

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import dagger.hilt.android.AndroidEntryPoint
import demo.mvvm.base.BaseActivity
import demo.mvvm.databinding.ActivityMainBinding
import demo.mvvm.model.dao.Pokemon
import demo.mvvm.viewmodel.MainViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import java.util.*

@ExperimentalCoroutinesApi
@AndroidEntryPoint
class MainActivity : BaseActivity<MainViewModel, ActivityMainBinding>() {

    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(mViewBinding.root)

        mViewBinding.btnClick.setOnClickListener {
            mainViewModel.getData("final.ce", "Sciffer@123", "", "", "", "", "", "", "", "", "")
                .observe(this,
                    Observer {
                        var pokemon = Pokemon(it.data!!.userDisplayName!!, it.data!!.mobileNo!!)
                        mainViewModel.insertData(pokemon)
                        mainViewModel.getPokemon().observe(this, Observer {
                            if(it!=null)
                            {

                            }else{

                            }
                        })
                        System.out.println("Result=" + it.data)
                    })

        }
    }

    override val mViewModel: MainViewModel by viewModels()

    override fun getViewBinding(): ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)


}