package com.dango.dx.biz.display

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chad.library.adapter4.BaseQuickAdapter
import com.dango.dx.biz.display.databinding.DxDisplayActivityBaseBinding
import com.dango.dx.biz.display.databinding.DxDisplayCardDisplayBinding
import com.dango.dx.common.base.activity.BaseActivity
import com.dango.dx.lib.widget.decoration.ItemDecorationUtil

/**
 * @author: Dango
 * @createTime: 2024/1/12 09:47
 * Description:
 *
 * Modification History:
 * -----------------------------------------------------------------------------------
 */
abstract class BaseDisplayActivity : BaseActivity<DxDisplayActivityBaseBinding>() {

    override val binding: DxDisplayActivityBaseBinding by lazy { DxDisplayActivityBaseBinding.inflate(LayoutInflater.from(this)) }

    abstract val data: List<DisplayBean>
    open val spanCount = 1
    open val title = "title"

    override fun initView() {
    }

    override fun initData() {
    }

    override fun lazyInitData() {
        super.lazyInitData()
        binding.displayRecycler.run {
            adapter = InnerAdapter()
            addItemDecoration(ItemDecorationUtil.ofDefault())
        }
    }

    private inner class InnerAdapter : BaseQuickAdapter<DisplayBean, InnerViewHolder>(data) {
        override fun onCreateViewHolder(context: Context, parent: ViewGroup, viewType: Int): InnerViewHolder {
            val b = DxDisplayCardDisplayBinding.inflate(LayoutInflater.from(context), parent, false)
            return InnerViewHolder(b)
        }

        override fun onBindViewHolder(holder: InnerViewHolder, position: Int, item: DisplayBean?) {
            holder.binding.tvLabel.text = item?.title
        }
    }

    private inner class InnerViewHolder(val binding: DxDisplayCardDisplayBinding) : RecyclerView.ViewHolder(binding.root)
}

sealed class DisplayBean(var title: String)
class ActivityDisplayBean(title: String, var activity: Class<out Activity>) : DisplayBean(title)
class MethodDisplayBean(title: String, var block: () -> Unit) : DisplayBean(title)