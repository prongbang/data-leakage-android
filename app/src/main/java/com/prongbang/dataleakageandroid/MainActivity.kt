package com.prongbang.dataleakageandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.prongbang.dataleakage.DataLeakageAndroid

class MainActivity : AppCompatActivity() {

    private val dataLeakageAndroid by lazy { DataLeakageAndroid() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataLeakageAndroid.setFlagSecure(window)
        setContentView(R.layout.activity_main)
    }
}