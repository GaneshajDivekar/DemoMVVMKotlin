package demo.mvvm

import android.os.Bundle
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint
import demo.mvvm.base.BaseActivity
import demo.mvvm.databinding.ActivityMainBinding
import demo.mvvm.viewmodel.MainViewModel
import androidx.lifecycle.Observer
import kotlinx.coroutines.ExperimentalCoroutinesApi

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
                        System.out.println("Result=" + it.data)
                    })
        }
    }

    override val mViewModel: MainViewModel by viewModels()

    override fun getViewBinding(): ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)


}