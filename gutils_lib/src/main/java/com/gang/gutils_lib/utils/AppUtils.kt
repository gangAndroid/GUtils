package com.gang.gutils_lib.utils

import android.content.Context
import android.os.Build

/**
 * 应用级工具类
 * @author gangAndroid on 2019/6/15.
 * @Github：https://github.com/gangAndroid
 */
object AppUtils {
    /**
     * 获取app的版本号
     */
    fun getVersionCode(context: Context): String {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            context.packageManager.getPackageInfo(context.packageName, 0).longVersionCode.toString()
        } else {
            context.packageManager.getPackageInfo(context.packageName, 0).versionCode.toString()
        }
    }

    /**
     * 获取app的版本名称
     */
    fun getVersionName(context: Context): String {
        return context.packageManager.getPackageInfo(context.packageName, 0).versionName.toString()
    }
}