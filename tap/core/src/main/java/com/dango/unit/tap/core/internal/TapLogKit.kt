package com.dango.unit.tap.core.internal

import android.util.Log
import com.dango.unit.tap.core.TapSDK

/**
 * @author: Dango
 * @createTime: 2024/3/14 10:27
 * Description:
 *
 * Modification History:
 * -----------------------------------------------------------------------------------
 */


internal fun logi(tag: String, msg: String, ex: Throwable) {
    Log.i(tag, msg, ex)
}

internal fun devLog(tag: String?, msg: String?) {
    if (TapSDK.isDebugEnabled() && tag != null && msg != null) {
        Log.i(tag, msg)
    }
}