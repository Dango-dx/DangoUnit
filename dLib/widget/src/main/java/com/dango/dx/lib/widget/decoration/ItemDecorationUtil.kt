package com.dango.dx.lib.widget.decoration

import android.graphics.Color
import androidx.annotation.Px
import androidx.recyclerview.widget.RecyclerView

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
                colorInt = Color.WHITE,
                startOffset = startOffset,
                endOffset = endOffset,
                startPadding = startPadding,
                endPadding = endPadding,
            )
        )
    }
}