package com.edu.user.usercenter.service

import com.edu.user.usercenter.domain.User
import io.reactivex.Observable

/**
 * Created by jl on 2019/1/18.
 */
interface UserService {
      fun login(name: String, password: String): Observable<User>

}