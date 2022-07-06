package com.example.hanacarakaproject.misc

import android.content.Context
import android.util.TypedValue
import androidx.annotation.NonNull
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler

class GridAutoFitLayoutManager : GridLayoutManager
{
    private var columnWidth = 0
    private var isColumnWidthChanged = true
    private var lastWidth = 0
    private var lastHeight = 0

    constructor(@NonNull context: Context, columnWidth: Int) : super(context, 1)
    {
        /* Initially set spanCount to 1, will be changed automatically later. */
        setColumnWidth(checkedColumnWidth(context, columnWidth))
    }

    constructor(
        @NonNull context: Context,
        columnWidth: Int,
        orientation: Int,
        reverseLayout: Boolean
    ) : super(context, 1, orientation, reverseLayout)
    {
        setColumnWidth(checkedColumnWidth(context, columnWidth))
    }

    private fun checkedColumnWidth(@NonNull context: Context, columnWidth: Int): Int
    {
        var columnWidth = columnWidth
        if (columnWidth <= 0)
        {
            columnWidth = TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, 48f,
                context.getResources().getDisplayMetrics()
            ).toInt()
        }
        return columnWidth
    }

    fun setColumnWidth(newColumnWidth: Int)
    {
        if (newColumnWidth > 0 && newColumnWidth != columnWidth)
        {
            columnWidth = newColumnWidth
            isColumnWidthChanged = true
        }
    }

    override fun onLayoutChildren(@NonNull recycler: Recycler, @NonNull state: RecyclerView.State)
    {
        val width = width
        val height = height
        if (columnWidth > 0 && width > 0 && height > 0 && (isColumnWidthChanged || lastWidth != width || lastHeight != height))
        {
            val totalSpace: Int
            totalSpace = if (orientation == VERTICAL)
            {
                width - paddingRight - paddingLeft
            }
            else
            {
                height - paddingTop - paddingBottom
            }
            val spanCount = Math.max(1, totalSpace / columnWidth)
            setSpanCount(spanCount)
            isColumnWidthChanged = false
        }
        lastWidth = width
        lastHeight = height
        super.onLayoutChildren(recycler, state)
    }
}