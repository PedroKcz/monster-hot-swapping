package com.pedrokcz.hotswappingexample.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.pedrokcz.hotswappingexample.R
import com.pedrokcz.hotswappingexample.databinding.ActivitySplashBinding

class SplashView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataBindingUtil.setContentView<ActivitySplashBinding>(
            this, R.layout.activity_splash
        )
    }
}
