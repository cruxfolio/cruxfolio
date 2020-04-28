package com.example.cruxfolio;

import android.webkit.WebView;

public abstract class MyAppWebViewClient {
    //hide the loading page
    public abstract void onPageFinished(WebView view, String url);
}
