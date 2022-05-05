package com.example.finalapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class webView extends AppCompatActivity {

    Intent current;
    WebView uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        current = getIntent();
        String link = current.getStringExtra("link");

        uri = (WebView) findViewById(R.id.web);
        uri = (WebView) findViewById(R.id.web);
        uri.getSettings().setJavaScriptEnabled(true);
        uri.setWebViewClient(new WebViewClient());
        uri.loadUrl(link);



    }
}