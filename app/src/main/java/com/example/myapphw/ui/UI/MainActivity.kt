package com.example.myapphw.ui.UI

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import com.example.myapphw.databinding.ActivityMainBinding
import com.example.myapphw.ui.UI.BaseActivity
import com.example.myapphw.ui.UI.Constant

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding = ActivityMainBinding::inflate
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        addCallBack()
    }
    
    override fun addCallBack() {
        binding?.nextbutton?.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            var name = binding!!.yourtext.text.toString()
            intent.putExtra(Constant.extraText, name)
            startActivity(intent)

        }
    }
}

