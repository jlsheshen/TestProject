package com.edu.testproject

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.blankj.utilcode.util.FileUtils
import com.edu.andfix.AndfixPatchManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object {
       const val FILEL_END = ".apatch"

    }
    private var mPatchDir:String=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mPatchDir =  externalCacheDir.absolutePath + "/apatch/"
        //创建文件夹
        FileUtils.createOrExistsFile(mPatchDir)
        //创建bug
        first_btn.setOnClickListener {
            var log = null
            Log.e("MainActivity","这个bug已经修复好啦")
        }
        //修复bug
        second_btn.setOnClickListener {
            AndfixPatchManager.INSTANCE.addPatch(getPatch())
        }
     }

    private fun getPatch(): String {
       return mPatchDir + "fix" + FILEL_END
    }
}
