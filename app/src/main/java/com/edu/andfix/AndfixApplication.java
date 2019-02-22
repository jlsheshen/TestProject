package com.edu.andfix;

import com.edu.baselibary.common.BaseApplication;

/**
 * Created by jl on 2019/2/20.
 */
public class AndfixApplication extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        AndfixPatchManager.INSTANCE.init();
    }
}
