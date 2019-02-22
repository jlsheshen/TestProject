package com.edu.user.usercenter.data.repository

import com.edu.baselibary.net.RetrofitFactory
import com.edu.user.usercenter.data.api.UserApi
import com.edu.user.usercenter.domain.User
import io.reactivex.Observable

/**
 * Created by jl on 2019/1/23.
 */
class UserRepository {
    fun login(name:String,password:String):Observable<User>{
        return RetrofitFactory.instance.create(UserApi::class.java).login(name,password)
    }
}