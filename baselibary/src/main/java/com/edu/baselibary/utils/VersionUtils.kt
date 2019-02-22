package com.edu.baselibary.utils

import android.content.Context

/**
 * Created by jl on 2019/2/20.
 */
object VersionUtils {
    fun getVersionName(context: Context):String{
        var versionName = "1.0.0"
        try {
            val pm = context.packageManager
            val pInfo = pm.getPackageInfo(context.packageName,0)
            versionName  = pInfo.versionName
        }catch (e:Exception){
            e.printStackTrace()
        }
        return versionName



    }
}