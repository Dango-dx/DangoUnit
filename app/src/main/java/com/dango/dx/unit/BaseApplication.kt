package com.dango.dx.unit

import android.app.Application
import com.dango.dx.lib.kit.logDev

class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        logDev { "Application onCreate" }
    }
}