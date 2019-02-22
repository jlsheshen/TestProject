package com.edu.baselibary.common

import android.app.ActivityManager
import android.content.Context
import android.support.v7.app.AppCompatActivity
import java.util.*

/**
 * Created by jl on 2018/10/22.
 */
class MActivityManager (){
  private  val activityStack:Stack<AppCompatActivity> = Stack()

    companion object {
        val instance:MActivityManager by lazy {
            MActivityManager()
        }
    }
    fun addActivity(activity: AppCompatActivity){
        activityStack.add(activity)
    }
    fun finishActivity(activity: AppCompatActivity){
        activity.finish()
        activityStack.remove(activity)
    }
    /**
     * 获取当前栈顶Activity
     */
    fun currentActivity( ): AppCompatActivity {
        return activityStack.lastElement()
    }
    /**
     * 清除所有Activity
     */
    fun currentAllActivity( ){
        for (activity in activityStack) {
            activity.finish()
        }
        activityStack.clear()

    }
    /**
     * 退出app
     */
    fun exitApp(context: Context){
        currentAllActivity()
        val activityManager = context.getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
        activityManager.killBackgroundProcesses(context.packageName)

        System.exit(0)
    }
}