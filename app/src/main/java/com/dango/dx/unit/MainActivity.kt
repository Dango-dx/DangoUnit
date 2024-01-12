package com.dango.dx.unit

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dango.dx.biz.display.ui.UIDisplayActivity
import com.dango.dx.common.base.activity.BaseActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        //
        super.onCreate(savedInstanceState)

        startActivity(Intent(this, UIDisplayActivity::class.java))
        finish()
    }
}