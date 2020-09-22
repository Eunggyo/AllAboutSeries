package com.aiden.allaboutwebview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView mWebView = null;
    private WebSettings mWebViewSettings = null;
    private final String YOUTUBE_URL="http://youtube.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    @Override
    protected void onResume() {
        super.onResume();
        init();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


    private void init() {
        mWebView = findViewById(R.id.web_view);
        mWebViewSettings = mWebView.getSettings();
        mWebView.loadUrl(YOUTUBE_URL);
        mWebView.setWebChromeClient(new WebChromeClient());
        mWebView.setWebViewClient(new WebViewClientClass());
         mWebViewSettings.setJavaScriptEnabled(true);
    }

    private void setWebView() {
        mWebViewSettings.setAllowContentAccess(true);   //WebView 내에서 콘텐트 URL Access 활성화 / 비활성화
        mWebViewSettings.setJavaScriptEnabled(true);    //WebView 에서 자바스크립트 실행 활성화 / 비활성화
    }
}