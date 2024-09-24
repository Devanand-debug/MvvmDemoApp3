package com.devanand.mvvmdemoapp3.repository

import com.devanand.mvvmdemoapp3.api.UserApi
import com.devanand.mvvmdemoapp3.models.UserModel
import retrofit2.Response
import javax.inject.Inject

class UserRepo @Inject constructor(private val api: UserApi) {

    suspend fun getUserDataRepo() : List<UserModel>{
        return api.getUserData()
    }
}