package com.example.baseandroid.data.remote

import com.example.baseandroid.models.LoginResponse
import io.reactivex.rxjava3.core.Single
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface ApiClient {
    @FormUrlEncoded
    @POST("login")
    fun callLogin(
        @Field("email") email: String,
        @Field("password") password: String
    ): Single<LoginResponse>
}
