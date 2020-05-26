package com.example.fbla_project3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class facebook extends AppCompatActivity {
    private WebView facebook;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);
        setTitle("Facebook");

        facebook = (WebView)findViewById(R.id.web);
        WebSettings webSettings = facebook.getSettings();

        facebook.getSettings().setSupportZoom(true);
        facebook.getSettings().setLoadWithOverviewMode(true);
        facebook.getSettings().setBuiltInZoomControls(true);

        webSettings.setJavaScriptEnabled(true);
        facebook.loadUrl("https://www.facebook.com/FutureBusinessLeaders/");
        facebook.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if (facebook.canGoBack()){
            facebook.goBack();
        } else
            super.onBackPressed();
    }
}

