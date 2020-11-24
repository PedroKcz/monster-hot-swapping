package com.pedrokcz.hotswappingexample.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.pedrokcz.hotswappingexample.R
import com.pedrokcz.hotswappingexample.databinding.MyActivityBinding

class MyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataBindingUtil.setContentView<MyActivityBinding>(
            this, R.layout.my_activity
        )
    }
}
