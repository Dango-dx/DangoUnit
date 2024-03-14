package com.dango.unit.tap.core.internal

import android.content.ContentProvider
import android.content.ContentValues
import android.database.Cursor
import android.net.Uri
import com.dango.unit.tap.core.TapSDK
import java.lang.Exception

/**
 * @author: Dango
 * @createTime: 2024/3/14 10:24
 * Description:
 *
 * Modification History:
 * -----------------------------------------------------------------------------------
 */
class TapCoreInitProvider : ContentProvider() {

    companion object {
        private val TAG = TapCoreInitProvider::class.java.simpleName
    }

    override fun onCreate(): Boolean {
        try {
            val context = this.context
            requireNotNull(context)
            TapSDK.sdkInitialize(context)
        } catch (ex: Exception) {
            logi(TAG, "Failed to auto initialize the TAPTAP SDK", ex)
        }
        return false
    }

    override fun query(uri: Uri, projection: Array<out String>?, selection: String?, selectionArgs: Array<out String>?, sortOrder: String?): Cursor? {
        return null
    }

    override fun getType(uri: Uri): String? {
        return null
    }

    override fun insert(uri: Uri, values: ContentValues?): Uri? {
        return null
    }

    override fun delete(uri: Uri, selection: String?, selectionArgs: Array<out String>?): Int {
        return 0
    }

    override fun update(uri: Uri, values: ContentValues?, selection: String?, selectionArgs: Array<out String>?): Int {
        return 0
    }
}