package com.example.streaminkaro;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView =findViewById(R.id.webVv);
        webView.loadUrl("https://goku.to/home");
        WebSettings webSettings=webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());

    }

    @Override
    public void onBackPressed() {
       if (webView.canGoBack()){
            webView.goBack();
       }
       else {
           super.onBackPressed();
       }
    }
}