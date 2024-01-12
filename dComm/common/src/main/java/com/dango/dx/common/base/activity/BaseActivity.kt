package com.dango.dx.common.base.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

/**
 * @author: Dango
 * @createTime: 2024/1/11 16:55
 * Description:
 *
 * Modification History:
 * -----------------------------------------------------------------------------------
 */
abstract class BaseActivity<B : ViewBinding> : AppCompatActivity() {

    protected abstract val binding: B

    private var isLazyInitial = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initView()
        initData()
    }

    override fun onResume() {
        super.onResume()
        if (!isLazyInitial) {
            isLazyInitial = true
            lazyInitData()
        }
    }

    abstract fun initView()

    abstract fun initData()

    open fun lazyInitData() {}

}