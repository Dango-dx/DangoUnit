package com.dango.dx.lib.widget

import android.annotation.SuppressLint
import android.content.Context

@SuppressLint("StaticFieldLeak")
object DxWidget {

    @JvmStatic
    internal lateinit var context: Context

    fun init(context: Context) {
        this.context = context.applicationContext
    }

}