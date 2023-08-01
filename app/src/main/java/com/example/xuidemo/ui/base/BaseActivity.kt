package com.example.xuidemo.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<VB : ViewBinding>(
    binding: (LayoutInflater) -> VB,
) : AppCompatActivity() {

    protected  open val mBinding by lazy {
        binding.invoke(layoutInflater)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(mBinding.root)

        initView()
        initListener()
        initEvent()
    }

    protected  open fun initListener() {

    }

    protected  open fun initEvent() {

    }

    protected open fun initView(){

    }

}