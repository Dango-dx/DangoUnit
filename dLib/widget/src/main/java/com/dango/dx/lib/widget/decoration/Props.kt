package com.dango.dx.lib.widget.decoration

import androidx.annotation.ColorInt
import androidx.annotation.Px

sealed class CommonItemDecorationProps()

class LinearLayoutProps(
    @ColorInt var colorInt: Int? = null,
    @Px var dividerWidth: Int = 1,
    var startOffset: Int = 0,
    var endOffset: Int = 0,
    @Px var startPadding: Int = 0,
    @Px var endPadding: Int = 0,
) : CommonItemDecorationProps()
