package com.innocyber.mvvmarticlelivedemo.data.network

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface Api {

    @FormUrlEncoded
    @POST("login")
    suspend fun userLogin(@Field("email") email:String, @Field("password") password:String):Response<AuthResponse>

    companion object{
        operator fun invoke():Api{
            return Retrofit.Builder().baseUrl("").
                    addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(Api::class.java)
        }
    }

}