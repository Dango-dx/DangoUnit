package com.dango.dx.lib.kit

import android.util.Log
import java.lang.Exception

@Suppress("unused")
inline fun logDev(vararg tags: Any?, msgBlock: () -> String = { "" }) {
    val vTag = if (tags.isEmpty()) {
        ""
    } else {
        val sb = StringBuilder()
        try {
            tags.filterNotNull().forEach {
                sb.append("[${it::class.java.simpleName}@${it.hashCode().toString(16)}]")
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        sb.toString()
    }
    try {
        val msg = msgBlock()
        Log.d("devLog", "Thread[${Thread.currentThread().name}] $vTag -->> $msg")
    } catch (e: Exception) {
        e.printStackTrace()
    }
}