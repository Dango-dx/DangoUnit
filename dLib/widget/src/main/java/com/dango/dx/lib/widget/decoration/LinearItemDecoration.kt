package com.dango.dx.lib.widget.decoration

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.view.View
import androidx.core.view.marginBottom
import androidx.core.view.marginRight
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class LinearItemDecoration(override val props: LinearLayoutProps) : IItemDecorationEntrust {

    private val dividerWidthPx: Int = props.dividerWidth

    private val dividerPaint: Paint by lazy {
        Paint().apply { color = props.colorInt ?: Color.TRANSPARENT }
    }

    override fun onDraw(c: Canvas, parent: RecyclerView, state: RecyclerView.State) {
        if (props.colorInt == null || props.colorInt == Color.TRANSPARENT) {
            return
        }
        if (isVerticalOrientation(parent)) {
            drawVertical(c, parent, state);
        } else {
            drawHorizontal(c, parent, state);
        }
    }

    private fun drawVertical(c: Canvas, parent: RecyclerView, state: RecyclerView.State) {
        val left = props.startPadding
        val right = parent.width - props.endPadding
        val childCount = parent.childCount
        val itemCount = state.itemCount
        var position: Int
        var bottom: Int
        var child: View
        for (i in 0 until childCount) {
            child = parent.getChildAt(i)
            position = parent.getChildAdapterPosition(child)
            if (props.startOffset > 0 && position < props.startOffset) {
                continue
            }
            if (props.endOffset > 0 && position >= itemCount - props.endOffset) {
                continue
            }
            bottom = child.bottom + dividerWidthPx
            c.drawRect(left.toFloat(), child.bottom.toFloat() + child.marginBottom, right.toFloat(), bottom.toFloat() + child.marginBottom, dividerPaint)
        }
    }

    private fun drawHorizontal(c: Canvas, parent: RecyclerView, state: RecyclerView.State) {
        val top = props.startPadding
        val bottom = parent.height - props.endPadding
        val childCount = parent.childCount
        val itemCount = state.itemCount
        var position: Int
        var right: Int
        var child: View
        for (i in 0 until childCount) {
            child = parent.getChildAt(i)
            position = parent.getChildAdapterPosition(child)
            if (props.startOffset > 0 && position < props.startOffset) {
                continue
            }
            if (props.endOffset > 0 && position >= itemCount - props.endOffset) {
                continue
            }
            right = child.right + dividerWidthPx
            c.drawRect(child.right.toFloat() + child.marginRight, top.toFloat(), right.toFloat() + child.marginRight, bottom.toFloat(), dividerPaint)
        }
    }

    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        val itemCount = state.itemCount
        val position = parent.getChildAdapterPosition(view)
        if (props.startOffset > 0 && position < props.startOffset) {
            return
        }
        if (props.endOffset > 0 && position >= itemCount - props.endOffset) {
            return
        }
        if (isVerticalOrientation(parent)) {
            outRect.bottom = dividerWidthPx
        } else {
            outRect.right = dividerWidthPx
        }
    }

    private fun isVerticalOrientation(recyclerView: RecyclerView): Boolean {
        return (recyclerView.layoutManager as? LinearLayoutManager)?.orientation == LinearLayoutManager.VERTICAL
    }

}