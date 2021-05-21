package com.example.myapphw.ui.UI

import android.os.Bundle
import android.view.LayoutInflater
import com.example.myapphw.databinding.ActivitySecond2Binding
import com.example.myapphw.ui.UI.BaseActivity
import com.example.myapphw.ui.UI.Constant

class SecondActivity2 : BaseActivity<ActivitySecond2Binding>() {
    override val bindingInflater: (LayoutInflater) -> ActivitySecond2Binding = ActivitySecond2Binding::inflate
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val text = intent.getStringExtra(Constant.extraText)
        binding!!.textView.text = text
    }

    override fun addCallBack() {
    }

}