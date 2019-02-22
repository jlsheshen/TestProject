package com.edu.baselibary.net

import com.edu.baselibary.common.Constant
import com.edu.baselibary.net.interceptor.HeadInterceptor
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * Created by jl on 2019/1/22.
 */
class RetrofitFactory private constructor(){
    companion object {
        val instance:RetrofitFactory by lazy {RetrofitFactory()}
    }
    private val retrofit:Retrofit
        init {
            retrofit = Retrofit
                    .Builder()
                    .client(initHttpClint())
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .baseUrl(Constant.BASE_URL)
                    .build()

        }

    private fun initHttpClint(): OkHttpClient {
        return OkHttpClient
                .Builder()
                .connectTimeout(10,TimeUnit.SECONDS)
                .readTimeout(10,TimeUnit.SECONDS)
                .writeTimeout(10,TimeUnit.SECONDS)
                .addInterceptor(initLogInterceptor())
                .addInterceptor(HeadInterceptor())
                 .build()
    }

    private fun initLogInterceptor(): Interceptor {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        return interceptor
    }
    fun <T> create(service:Class<T>): T {

                return retrofit.create(service)
    }

}