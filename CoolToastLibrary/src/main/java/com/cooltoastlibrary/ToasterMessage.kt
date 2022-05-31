package com.cooltoastlibrary

import android.content.Context
import android.widget.Toast

class ToasterMessage {

    fun showCoolToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}