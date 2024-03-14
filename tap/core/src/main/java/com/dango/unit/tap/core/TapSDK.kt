package com.dango.unit.tap.core

import android.content.Context
import com.dango.unit.tap.core.internal.devLog

/**
 * @author: Dango
 * @createTime: 2024/3/14 10:30
 * Description:
 *
 * Modification History:
 * -----------------------------------------------------------------------------------
 */
object TapSDK {

    private val TAG = TapSDK::class.java.canonicalName

    @Volatile
    private var isDebugEnabledField = false


    fun sdkInitialize(applicationContext: Context) {
        devLog(TAG, "sdkInitialize applicationContext = $applicationContext")
    }

    @JvmStatic
    fun isDebugEnabled(): Boolean {
        return isDebugEnabledField
    }
}