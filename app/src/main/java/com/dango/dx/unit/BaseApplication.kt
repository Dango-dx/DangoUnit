package com.dango.dx.unit

import android.app.Application
import com.dango.dx.lib.kit.logDev
import com.dango.dx.lib.widget.DxWidget

class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        logDev { "Application onCreate" }
        DxWidget.init(this)
    }
}