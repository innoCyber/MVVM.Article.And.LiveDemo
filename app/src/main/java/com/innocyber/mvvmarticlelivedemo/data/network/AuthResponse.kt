package com.innocyber.mvvmarticlelivedemo.data.network

import com.innocyber.mvvmarticlelivedemo.data.db.User

data class AuthResponse(val isSuccessful: Boolean?,val message: String?, val user: User?)