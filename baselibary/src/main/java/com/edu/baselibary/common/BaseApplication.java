package com.edu.baselibary.common;

import android.app.Application;
import android.content.Context;

/**
 * Created by jl on 2018/10/17.
 */
public class BaseApplication extends Application{
    public static Context context ;
    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
     }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }
}
