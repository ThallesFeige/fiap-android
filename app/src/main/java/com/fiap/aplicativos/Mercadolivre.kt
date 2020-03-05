package com.fiap.aplicativos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import com.fiap.aplicativos.Mercadolivre
import kotlinx.android.synthetic.main.activity_mercadolivre.*

class Mercadolivre : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mercadolivre)

        Mercadolivre.webViewClient = WebViewClient()
        Mercadolivre.settings.javaScriptEnabled = true
        Mercadolivre.settings.builtInZoomControls = true

        Mercadolivre.loadUrl("https://www.mercadolivre.com.br/")




    }
}
