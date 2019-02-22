package com.edu.baselibary.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.edu.baselibary.common.MActivityManager


/**
 * Created by jl on 2018/10/22.
 */
open class BaseActivity :AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MActivityManager.instance.addActivity(this)
        val mActivityManager :MActivityManager = MActivityManager()
    }

    override fun onDestroy() {
        super.onDestroy()

    }

}