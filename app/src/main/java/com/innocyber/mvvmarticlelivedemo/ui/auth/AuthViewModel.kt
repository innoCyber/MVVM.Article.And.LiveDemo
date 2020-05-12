package com.innocyber.mvvmarticlelivedemo.ui.auth

import androidx.lifecycle.ViewModel
import com.innocyber.mvvmarticlelivedemo.data.repository.UserRepository
import com.innocyber.mvvmarticlelivedemo.util.Coroutines

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
        Coroutines.main {
            val response = UserRepository().userLogin(email!!,password!!)
            if (response.isSuccessful){
                authListener?.onSuccess(response.body()?.user!!)
            }
        }
    }
}