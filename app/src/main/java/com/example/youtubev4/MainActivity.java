package com.example.youtubev4;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView youtubeWebView;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        youtubeWebView = findViewById(R.id.youtube_web_view);
        youtubeWebView.setWebViewClient(new WebViewClient());
        youtubeWebView.loadUrl("https://m.youtube.com/");
        youtubeWebView.setWebChromeClient(new WebChromeClient());
        WebSettings webSettings = youtubeWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setPluginState(WebSettings.PluginState.ON);
    }

    @Override
    public void onBackPressed() {
        if (youtubeWebView.canGoBack())
            youtubeWebView.goBack();
        else
            super.onBackPressed();
    }
}