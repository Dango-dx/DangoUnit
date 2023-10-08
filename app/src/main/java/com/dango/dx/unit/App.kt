package com.dango.dx.unit

import android.app.Application
import com.dango.dx.lib.kit.devLog

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        devLog { "Application onCreate" }
    }
}