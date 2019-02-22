package com.edu.baselibary.rx

import android.util.Log
import io.reactivex.Observer
import io.reactivex.disposables.Disposable

/**
 * Created by jl on 2019/1/18.
 */
open class MObserver<T> : Observer<T>{
    override fun onComplete() {
        Log.d("*----","当前线程名称" + Thread.currentThread().name  +"onComplete" )    }

    override fun onSubscribe(d: Disposable) {
        Log.d("*----","当前线程名称" + Thread.currentThread().name +"onSubscribe")    }

    override fun onNext(t: T) {
        Log.d("*----","当前线程名称" + Thread.currentThread().name+"onNext")    }

    override fun onError(e: Throwable) {
        Log.d("*----","当前线程名称" + Thread.currentThread().name+"onError")    }


}