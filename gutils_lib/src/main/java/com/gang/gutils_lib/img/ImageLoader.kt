package com.gang.gutils_lib.img

import android.content.Context
import android.widget.ImageView

/**
 * 图片加载
 * @author gangAndroid on 2019/6/15.
 * @Github：https://github.com/gangAndroid
 */
object ImageLoader {
    var imageLoaderInterface: ImageLoaderInterface? = null
    fun setImageLoader(imageLoaderInterface: ImageLoaderInterface) {
        this.imageLoaderInterface = imageLoaderInterface
    }

    fun loadImg(context: Context, img: ImageView, url: String) {
        if (imageLoaderInterface != null)
            imageLoaderInterface!!.loadImg(context, img, url)
    }
}