package com.fiap.aplicativos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import com.fiap.aplicativos.Carrefour
import kotlinx.android.synthetic.main.activity_carrefour.*
import kotlinx.android.synthetic.main.activity_natura.*

class Carrefour : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carrefour)

        Carrefour.webViewClient = WebViewClient()
        Carrefour.settings.javaScriptEnabled = true
        Carrefour.settings.builtInZoomControls = true

        Carrefour.loadUrl("https://www.carrefour.com.br/")

    }
}
