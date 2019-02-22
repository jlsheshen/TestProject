package com.edu.andfix;

import com.alipay.euler.andfix.patch.PatchManager;
import com.edu.baselibary.utils.VersionUtils;

import java.io.IOException;

import static com.edu.baselibary.common.BaseApplication.context;

/**
 * Created by jl on 2019/2/20.
 */
public class AndfixPatchManager {
    public AndfixPatchManager( ) {
     }

    public static AndfixPatchManager INSTANCE = AndfixHolder.holder;

    private static PatchManager mPatchmanager;


    private static class AndfixHolder {
        private static AndfixPatchManager holder = new AndfixPatchManager();
    }
    //初始化andfix
    public void init( ){
        mPatchmanager = new PatchManager(context);
        mPatchmanager.init(VersionUtils.INSTANCE.getVersionName(context));//current version
        mPatchmanager.loadPatch();

    }
    public void addPatch(String path){
        try {
            if (mPatchmanager != null) {
                mPatchmanager.addPatch(path);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
