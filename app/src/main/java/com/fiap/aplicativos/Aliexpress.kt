package com.fiap.aplicativos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.fiap.aplicativos.Aliexpress
import kotlinx.android.synthetic.main.activity_aliexpress.*

class Aliexpress : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aliexpress)

        Aliexpress.webViewClient = WebViewClient()

        Aliexpress.settings.javaScriptEnabled = true
        Aliexpress.settings.builtInZoomControls = true

        Aliexpress.loadUrl("https://pt.aliexpress.com/")


    }
}
