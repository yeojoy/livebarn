package me.yeojoy.livebarn.network

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import java.net.URL

class ImageLoadRepository {

    fun loadImage(urlAddress: String) : Bitmap {
        val url = URL(urlAddress)
        url.openStream().use {
            return BitmapFactory.decodeStream(it)
        }
    }
}