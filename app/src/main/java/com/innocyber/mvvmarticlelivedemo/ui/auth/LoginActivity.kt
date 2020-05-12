package com.innocyber.mvvmarticlelivedemo.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.innocyber.mvvmarticlelivedemo.R
import com.innocyber.mvvmarticlelivedemo.databinding.ActivityLoginBinding
import com.innocyber.mvvmarticlelivedemo.util.toast

class LoginActivity : AppCompatActivity(),AuthListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityLoginBinding = DataBindingUtil.setContentView(this,R.layout.activity_login)
        val viewModel: AuthViewModel = ViewModelProviders.of(this).get(AuthViewModel::class.java)
        binding.viewmodelLogin = viewModel
        viewModel.authListener=this
    }

    override fun onStarted() {
        toast("Login started")
    }

    override fun onSuccess() {
        toast("Login success")
    }

    override fun onFailure(message: String) {
        toast(message)
    }
}
