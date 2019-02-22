package com.edu.baselibary.presenter

import android.content.Context
import com.edu.baselibary.view.BaseView
import com.kotlin.base.utils.NetWorkUtils

/**
 * Created by jl on 2018/10/22.
 */
open class BasePresenter<T:BaseView> {
    lateinit var mView:T

    lateinit var context: Context

    fun checkNetWork():Boolean{
        if(NetWorkUtils.isNetWorkAvailable(context)){
            return true
        }
        mView.showError("网络不可用")
        return false
    }

}