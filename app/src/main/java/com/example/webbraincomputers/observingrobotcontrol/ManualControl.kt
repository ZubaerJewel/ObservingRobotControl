package com.example.webbraincomputers.observingrobotcontrol

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import kotlinx.android.synthetic.main.activity_manual_control.*
import kotlinx.android.synthetic.main.activity_obstacle_avoid.*

class ManualControl : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manual_control)

        //mcWebView.loadUrl("http://192.168.1.47:8000")
        val Load: Button = findViewById(R.id.mcbtnLoad)
        // oaWebView.loadUrl("http://192.168.43.23:8000")
        Load.setOnClickListener {
            val sb = StringBuilder();
            val URL = sb.append("http://").append(editTextIPmc.text).append(":8000").toString();
            oaWebView.settings.javaScriptEnabled = true
            oaWebView.settings.loadsImagesAutomatically = true
            oaWebView.settings.setAppCacheEnabled(true) // Disable while debugging
            oaWebView.loadUrl(URL)
        }
    }
}
