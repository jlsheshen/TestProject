package com.edu.user.usercenter.domain

import java.util.*

/**
 * Created by jl on 2019/2/22.
 */
class User {
    var uid: String? = null
    var username: String? = null
    var password: String? = null
    var name: String? = null
    var email: String? = null
    var telephone: String? = null
    var birthday: Date? = null
    var sex: String? = null
    var state: Int = 0 //#状态：0=未激活，1=已激活
    var code: String? = null //#激活码

    constructor(uid: String, username: String, password: String, name: String, email: String, telephone: String,
                birthday: Date, sex: String, state: Int, code: String) : super() {
        this.uid = uid
        this.username = username
        this.password = password
        this.name = name
        this.email = email
        this.telephone = telephone
        this.birthday = birthday
        this.sex = sex
        this.state = state
        this.code = code
    }


    constructor() {
        // TODO Auto-generated constructor stub
    }

    override fun toString(): String {
        return ("User [uid=" + uid + ", username=" + username + ", password=" + password + ", name=" + name + ", email="
                + email + ", telephone=" + telephone + ", birthday=" + birthday + ", sex=" + sex + ", state=" + state
                + ", code=" + code + "]")
    }

}
