package com.edu.user.usercenter.presenter

import android.util.Log
import com.edu.baselibary.common.ext.excute
import com.edu.baselibary.presenter.BasePresenter
import com.edu.baselibary.rx.MObserver
import com.edu.user.usercenter.domain.User
import com.edu.user.usercenter.service.imp.UserServiceImp

/**
 * Created by jl on 2018/10/23.
 */
class LoginPresenter : BasePresenter<LoginView>() {
    fun login( userName:String, userPassword:String){
        var userService = UserServiceImp()
        userService.login(userName,userPassword)
                .excute(object : MObserver<User>() {
                    override fun onNext(t: User) {
                        super.onNext(t)
                         if (t==null){
                             Log.d("*----","接口失败当前线程名称" + Thread.currentThread().name)
                             mView.fail()

                         }else{
                             mView.success()

                             Log.d("----","接口成功当前线程名称" + Thread.currentThread().name + t.name )
                         }
                        }
                   }
                )


    }


}



