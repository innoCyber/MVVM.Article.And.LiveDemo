package com.innocyber.mvvmarticlelivedemo.ui.auth

import com.innocyber.mvvmarticlelivedemo.data.db.User

interface AuthListener {

    fun onStarted()
    fun onSuccess(user: User)
    fun onFailure(message:String)
}