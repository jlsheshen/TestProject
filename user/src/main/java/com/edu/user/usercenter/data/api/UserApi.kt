package com.edu.user.usercenter.data.api

import com.edu.user.usercenter.domain.User
import io.reactivex.Observable
import retrofit2.http.POST
import retrofit2.http.Query

/**
 * Created by jl on 2019/1/23.
 */
interface UserApi {
    /**
     * 用户登录
     */
    @POST("/UserServlet?method=login")
    fun login (@Query("username") name:String,@Query("username") password:String):Observable<User>
}