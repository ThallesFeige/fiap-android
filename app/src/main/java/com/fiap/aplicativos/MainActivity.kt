package com.fiap.aplicativos

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.fiap.aplicativos.Aliexpress
import kotlinx.android.synthetic.main.activity_aliexpress.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//
//        mercadoLivre.setOnClickListener {view  ->
//            var intent = Intent(this, Mercadolivre::class.java)
//            startActivity(intent);
//        }
//
//        aliex.setOnClickListener {view ->
//            var intent = Intent(this, Aliexpress::class.java)
//            startActivity(intent);
//        }
//
//        carrefour.setOnClickListener {view ->
//            var intent = Intent(this, Carrefour::class.java)
//            startActivity(intent);
//        }
//
//        lulu.setOnClickListener {view ->
//            var intent = Intent(this, Magalu::class.java)
//            startActivity(intent);
//        }
//
//        amazon.setOnClickListener {view ->
//            var intent = Intent(this, Amazon::class.java)
//            startActivity(intent);
//        }

        var verResultado = getSharedPreferences("dados", Context.MODE_PRIVATE)

        var dadosMercadolivre = verResultado.getInt("mercadoLivre", 0);
        var dadosMagalu = verResultado.getInt("lulu", 0);
        var dadosCarrefour = verResultado.getInt("carrefour", 0);
        var dadosAmazon = verResultado.getInt("amazon", 0);
        var dadosAliexpress = verResultado.getInt("aliexpress", 0);

        Aliexpress.setOnClickListener{
            verResultado.edit().putInt("aliexpress", dadosAliexpress + 1).apply()
            var intent = Intent(this, WebView::class.java)
            intent.putExtra("url", "https://pt.aliexpress.com/")
            startActivity(intent)
        }

        mercadoLivre.setOnClickListener {

            verResultado.edit().putInt("mercadoLivre", dadosMercadolivre+1).apply()
            var intent = Intent(this, WebView::class.java)
            intent.putExtra("url", "https://www.mercadolivre.com.br/")
            startActivity(intent)

        }

        lulu.setOnClickListener{
            verResultado.edit().putInt("lulu", dadosMagalu+1).apply()
            var intent = Intent(this, WebView::class.java)
            intent.putExtra("url", "https://www.magazineluiza.com.br/")
            startActivity(intent)
        }

        carrefour.setOnClickListener{
            verResultado.edit().putInt("carrefour", dadosCarrefour+1).apply()
            var intent = Intent(this, WebView::class.java)
            intent.putExtra("url", "https://www.carrefour.com.br/")
            startActivity(intent)
        }

        amazon.setOnClickListener{
            verResultado.edit().putInt("amazon", dadosAmazon+1).apply()
            var intent = Intent(this, WebView::class.java)
            intent.putExtra("url", "https://www.amazon.com.br/")
            startActivity(intent)
        }

        button.setOnClickListener{
            var intent = Intent(this, ContaResultado::class.java)
            intent.putExtra("dados","AliExpress: "
                    + dadosAliexpress + "\n"
                    + "Mercado Livre: " + dadosMercadolivre + "\n"
                    + "Magazine Luiza: " + dadosMagalu + "\n"
                    + "Carrefour "+ dadosCarrefour + "\n"
                    + "Amazon: " + dadosAmazon)
            startActivity(intent)
        }

    }
}
