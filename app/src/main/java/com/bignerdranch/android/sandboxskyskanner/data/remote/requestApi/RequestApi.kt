package com.bignerdranch.android.sandboxskyskanner.data.remote.requestApi

import com.bignerdranch.android.sandboxskyskanner.RecieveResponse

import io.reactivex.Single
import retrofit2.http.*

interface RequestApi {
    @GET("./apiservices/v3/flights/live/search/create")
    fun Request():Single<RecieveResponse>

}
