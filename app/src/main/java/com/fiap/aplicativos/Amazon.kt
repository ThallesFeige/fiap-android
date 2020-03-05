package com.fiap.aplicativos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import com.fiap.aplicativos.Amazon
import kotlinx.android.synthetic.main.activity_amazon.*

class Amazon : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_amazon)

        Amazon.webViewClient = WebViewClient()
            Amazon.settings.javaScriptEnabled = true
            Amazon.settings.builtInZoomControls = true

            Amazon.loadUrl("https://www.amazon.com.br/")

    }
}
