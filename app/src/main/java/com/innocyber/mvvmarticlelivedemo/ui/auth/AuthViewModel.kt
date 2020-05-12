package com.innocyber.mvvmarticlelivedemo.ui.auth

import androidx.lifecycle.ViewModel
import com.innocyber.mvvmarticlelivedemo.data.repository.UserRepository

class AuthViewModel: ViewModel() {

    var email:String? = null
    var password:String? = null

     var authListener: AuthListener? =  null

    fun onLoginButtonClick(){
        authListener!!.onStarted()
        if (email.isNullOrEmpty() || password.isNullOrEmpty()){
            authListener!!.onFailure("Login failed")
            return
        }
        val loginResponse = UserRepository().userLogin(email!!,password!!)
        authListener?.onSuccess(loginResponse)
    }
}