package com.dango.dx.biz.display.ui

import android.widget.Toast
import com.dango.dx.biz.display.BaseDisplayActivity
import com.dango.dx.biz.display.DisplayBean
import com.dango.dx.biz.display.MethodDisplayBean
import com.dango.dx.lib.widget.dialog.BaseBottomSheetDialog

/**
 * @author: Dango
 * @createTime: 2024/1/11 17:59
 * Description:
 *
 * Modification History:
 * -----------------------------------------------------------------------------------
 */
class UIDisplayActivity : BaseDisplayActivity() {
    override val data: List<DisplayBean> = listOf(
        MethodDisplayBean("BaseBottomSheetDialog") {
            BaseBottomSheetDialog(this).show()
        },
        MethodDisplayBean("Dialog2") {
            Toast.makeText(this, "Dialog2", Toast.LENGTH_LONG).show()
        },
    )

}