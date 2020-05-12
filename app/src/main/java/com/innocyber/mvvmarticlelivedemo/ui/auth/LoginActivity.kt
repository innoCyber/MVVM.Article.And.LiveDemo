package com.innocyber.mvvmarticlelivedemo.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.innocyber.mvvmarticlelivedemo.R
import com.innocyber.mvvmarticlelivedemo.databinding.ActivityLoginBinding
import com.innocyber.mvvmarticlelivedemo.util.hide
import com.innocyber.mvvmarticlelivedemo.util.show
import com.innocyber.mvvmarticlelivedemo.util.toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(),AuthListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityLoginBinding = DataBindingUtil.setContentView(this,R.layout.activity_login)
        val viewModel: AuthViewModel = ViewModelProviders.of(this).get(AuthViewModel::class.java)
        binding.viewmodelLogin = viewModel
        viewModel.authListener=this
    }

    override fun onStarted() {
        progress_bar.show()
    }

    override fun onSuccess(loginResponse: LiveData<String>) {
        loginResponse.observe(this, Observer {
            progress_bar.hide()
            toast(it)
        })
    }

    override fun onFailure(message: String) {
        progress_bar.hide()
        toast(message)
    }
}
