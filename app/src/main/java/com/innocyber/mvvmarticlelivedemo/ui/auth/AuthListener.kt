package com.innocyber.mvvmarticlelivedemo.ui.auth

interface AuthListener {

    fun onStarted()
    fun onSuccess()
    fun onFailure(message:String)
}