package com.dango.dx.lib.widget.decoration

import android.graphics.Canvas
import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class CommonItemDecoration(props: CommonItemDecorationProps) : RecyclerView.ItemDecoration() {

    private val delegate by ItemDecorationDelegate(props)

    override fun onDraw(c: Canvas, parent: RecyclerView, state: RecyclerView.State) {
        super.onDraw(c, parent, state)
        delegate.onDraw(c, parent, state)
    }

    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        super.getItemOffsets(outRect, view, parent, state)
        delegate.getItemOffsets(outRect, view, parent, state)
    }
}
