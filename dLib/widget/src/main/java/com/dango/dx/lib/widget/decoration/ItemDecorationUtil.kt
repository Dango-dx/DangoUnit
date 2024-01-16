package com.dango.dx.lib.widget.decoration

import android.graphics.Color
import androidx.annotation.Px
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.dango.dx.lib.widget.DxWidget
import com.dango.dx.lib.widget.R

object ItemDecorationUtil {

    @JvmStatic
    @JvmOverloads
    fun ofDefault(
        @Px dividerWidth: Int = 1,
        startOffset: Int = 0,
        endOffset: Int = 0,
        @Px startPadding: Int = 0,
        @Px endPadding: Int = 0,
    ): RecyclerView.ItemDecoration {
        return CommonItemDecoration(
            LinearLayoutProps(
                dividerWidth = dividerWidth,
                colorInt = ContextCompat.getColor(DxWidget.context, R.color.dx_divider),
                startOffset = startOffset,
                endOffset = endOffset,
                startPadding = startPadding,
                endPadding = endPadding,
            )
        )
    }
}