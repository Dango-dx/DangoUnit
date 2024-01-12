package com.dango.dx.lib.widget.decoration

import android.graphics.Canvas
import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlin.reflect.KProperty

internal interface IItemDecorationEntrust {
    val props: CommonItemDecorationProps

    fun onDraw(c: Canvas, parent: RecyclerView, state: RecyclerView.State)

    fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State)
}


internal class ItemDecorationDelegate(private val props: CommonItemDecorationProps) {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): IItemDecorationEntrust {
        return when (props) {
            is LinearLayoutProps -> {
                LinearItemDecoration(props)
            }
        }
    }
}