package com.edu.baselibary.ui

import com.edu.baselibary.presenter.BasePresenter
import com.edu.baselibary.view.BaseView

/**
 * Created by jl on 2018/10/22.
 */
open class BaseMvpActivity<T: BasePresenter<*>> : BaseActivity() ,BaseView{

    lateinit var presenter: T

    override fun showError(error: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}