package me.nosaka.webviewv85brokentest

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebResourceRequest
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        webView.settings.run {
            javaScriptEnabled = true
            userAgentString = "Mozilla/5.0 (Linux; Android 7.1.2; PIXEL 2 XL Build/NOF26V; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/72.0.3626.121 Mobile Safari/537.36"
            mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        }
//        webView.webChromeClient = object : WebChromeClient() {
//
//        }
        webView.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
                return super.shouldOverrideUrlLoading(view, request)
            }

        }

        webView.loadUrl("https://www.mercari.com/jp/transaction/buy/m79641284645/")
    }
}