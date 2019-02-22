package com.edu.user.usercenter.presenter

import com.edu.baselibary.view.BaseView

/**
 * Created by jl on 2018/10/23.
 */
interface LoginView :BaseView {
    fun  login()
    fun inLogining()
    fun success()
    fun fail()

}