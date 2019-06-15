package com.gang.gutils_lib.img

import android.content.Context
import android.widget.ImageView

/**
 * @author gangAndroid on 2019/6/15.
 * @Github：https://github.com/gangAndroid
 */
interface ImageLoaderInterface {
    fun loadImg(context: Context, img: ImageView, url: String)
    fun loadImgOfSize(context: Context, img: ImageView, url: String, w: Int, h: Int)
}