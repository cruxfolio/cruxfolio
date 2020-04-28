package com.example.cruxfolio;

import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    public WebView mwebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mwebView = (WebView) findViewById(R.id.webview);
        WebSettings webSettings = mwebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mwebView.loadUrl("https://www.cruxfolio.com");
        mwebView.setWebViewClient(new WebViewClient());
    }
    public class mWebClient<view> extends WebViewClient {
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon){
            super.onPageStarted(view, url, favicon);
        }
            @Override
            public boolean shouldOverrideUrlLoading( WebView view,String url){
            view.loadUrl(url);
             return true;
        }
    }
    @Override
        public void onBackPressed(){
        if(mwebView.canGoBack()) {
            mwebView.goBack();
        }else{
                super.onBackPressed();
            }
        }
    }

