package com.edu.user.usercenter.service.imp

import com.edu.user.usercenter.data.repository.UserRepository
import com.edu.user.usercenter.domain.User
import com.edu.user.usercenter.service.UserService
import io.reactivex.Observable

/**
 * Created by jl on 2019/1/18.
 */
class UserServiceImp : UserService {
    override fun login(name: String, password: String): Observable<User> {
            val userRepository = UserRepository()
          return  userRepository.login(name,password)

     }
}
