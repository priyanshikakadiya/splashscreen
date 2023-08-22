package com.app.splashscreen.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import com.app.splashscreen.R
import com.app.splashscreen.databinding.ActivityWebViewBinding

class WebViewActivity : AppCompatActivity() {

    lateinit var mBinding: ActivityWebViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityWebViewBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        mBinding.webView.webViewClient = WebViewClient()
        mBinding.webView.loadUrl("https://www.google.com/")
//        mBinding.webView.loadUrl("https://rku.ac.in/")
        mBinding.webView.settings.javaScriptEnabled = true
        mBinding.webView.settings.setSupportZoom(true)
    }

    override fun onBackPressed() {
        if (mBinding.webView.canGoBack())
            mBinding.webView.goBack()
        else
            super.onBackPressed()
    }
}