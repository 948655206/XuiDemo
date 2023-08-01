package com.example.xuidemo

import com.blankj.utilcode.util.LogUtils
import com.example.xuidemo.databinding.ActivityMainBinding
import com.example.xuidemo.ui.base.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding>(
    ActivityMainBinding::inflate
) {
    override fun initListener() {
        super.initListener()

//        mBinding.apply {
//            rating.setOnRatingChangeListener { ratingBar, rating ->
//                LogUtils.d("debug测试==>${rating.toInt()}")
//            }
//        }
    }
}