package com.dango.dx.lib.widget.dialog

import android.content.Context
import android.os.Bundle
import com.dango.dx.lib.widget.R
import com.google.android.material.bottomsheet.BottomSheetDialog

/**
 * @author: Dango
 * @createTime: 2024/1/16 14:58
 * Description:
 *
 * Modification History:
 * -----------------------------------------------------------------------------------
 */
class BaseBottomSheetDialog(private val context: Context) : BottomSheetDialog(context, R.style.Dx_BottomSheetDialog) {
    init {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dx_base_bottom_sheet_dialog)
    }
}