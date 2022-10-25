package com.bignerdranch.android.sandboxskyskanner

import android.app.Application
import com.bignerdranch.android.sandboxskyskanner.data.remote.requestApi.RequestApi
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query
import java.lang.Exception


class SkyScanner:Application(){
    lateinit var requestApi:RequestApi
    override fun onCreate() {
        super.onCreate()
    configureRetrofit()
    }
    private fun configureRetrofit(){
        val httpLoggingInterceptor = HttpLoggingInterceptor()
            httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        val okhttpClient = OkHttpClient.Builder()
            .addInterceptor(httpLoggingInterceptor)
            .build()
        val retrofit = Retrofit.Builder()
            .baseUrl("https://partners.api.skyscanner.net")
            .client(okhttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
        requestApi = retrofit.create(RequestApi::class.java)
    }
}