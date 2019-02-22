package com.edu.tinker;

import android.content.Context;

 import com.tencent.tinker.lib.listener.DefaultPatchListener;

/**
 * @author: vision
 * @function: 1.较验patch文件是否合法  2.启动Service去安装patch文件
 * @date: 17/5/11
 */
public class CustomPatchListener extends DefaultPatchListener {

    private String currentMD5;

    public void setCurrentMD5(String md5Value) {

        this.currentMD5 = md5Value;
    }

    public CustomPatchListener(Context context) {
        super(context);
    }

//    @Override
//    protected int patchCheck(String path) {
//        //patch文件ms5较验
//        if (!com.edu.util.Utils.isFileMD5Matched(path, currentMD5)) {
//
//            return ShareConstants.ERROR_PATCH_DISABLE;
//        }
//
//
//        return super.patchCheck(path);
//    }
}
