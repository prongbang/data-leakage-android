package com.prongbang.dataleakage

import android.view.Window
import android.view.WindowManager

class DataLeakageAndroid {

    fun setFlagSecure(window: Window?) {
        window?.setFlags(
            WindowManager.LayoutParams.FLAG_SECURE,
            WindowManager.LayoutParams.FLAG_SECURE
        )
    }
}