package com.edu.baselibary.common.ext

import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by jl on 2019/1/18.
 */
    fun <T> Observable<T>.excute(observer: Observer<T>) {
        this.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(observer)
         }
