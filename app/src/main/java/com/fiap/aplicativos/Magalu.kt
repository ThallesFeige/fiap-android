package com.fiap.aplicativos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import com.fiap.aplicativos.Magalu
import kotlinx.android.synthetic.main.activity_magalu.*

class Magalu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_magalu)

        Magalu.webViewClient = WebViewClient()
        Magalu.settings.javaScriptEnabled = true
        Magalu.settings.builtInZoomControls = true

        Magalu.loadUrl("https://www.magazineluiza.com.br/")

    }
}
