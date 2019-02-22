package com.edu.baselibary.net.interceptor

import okhttp3.Interceptor
import okhttp3.Response

/**
 * Created by jl on 2019/1/22.
 */
class HeadInterceptor :Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        //添加header
        val request = chain.request().newBuilder()
                .header("Content-Type", "application/json")
                .header("Charset", "UTF-8")
                .build()
        return chain.proceed(request)
    }
}