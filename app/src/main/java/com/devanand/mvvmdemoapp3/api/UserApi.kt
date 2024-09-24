package com.devanand.mvvmdemoapp3.api

import com.devanand.mvvmdemoapp3.models.UserModel
import retrofit2.Response
import retrofit2.http.GET

interface UserApi {

    @GET("")
    suspend fun getUserData() : List<UserModel>
}