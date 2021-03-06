package com.innocyber.mvvmarticlelivedemo.data.repository

import com.innocyber.mvvmarticlelivedemo.data.network.Api
import com.innocyber.mvvmarticlelivedemo.data.network.AuthResponse
import retrofit2.Response

class UserRepository {
    suspend fun userLogin(email:String, password: String): Response<AuthResponse>{

        return Api().userLogin(email, password)
    }
}