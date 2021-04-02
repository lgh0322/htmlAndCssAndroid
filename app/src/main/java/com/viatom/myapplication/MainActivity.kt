package com.viatom.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val web:WebView=findViewById(R.id.dada)
        web.settings.setJavaScriptEnabled(true);//启用js
        web.settings.blockNetworkImage = false;//解决图片不显示
        web.settings.useWideViewPort=true
        web.settings.loadWithOverviewMode=true
        web.loadUrl("file:android_asset/index.html")
    }
}