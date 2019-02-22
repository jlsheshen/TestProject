package com.edu.user.usercenter

 import android.os.Bundle
 import android.widget.Toast
 import com.edu.baselibary.ui.BaseMvpActivity
 import com.edu.user.R
 import com.edu.user.usercenter.presenter.LoginPresenter
 import com.edu.user.usercenter.presenter.LoginView
 import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : BaseMvpActivity<LoginPresenter>(), LoginView {
    override fun fail() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun inLogining() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun success() {
        Toast.makeText(this,"登录成功成功",Toast.LENGTH_SHORT)
    }

    override fun login() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        presenter = LoginPresenter()
        presenter.mView = this
        userSubmit.setOnClickListener { presenter.login(userName.text.toString(),userPassword.text.toString())}
    }
}
