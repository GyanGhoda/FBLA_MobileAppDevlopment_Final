package com.example.fbla_project3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class twitter extends AppCompatActivity {
    private WebView twitter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twitter);
        setTitle("Twitter");

        twitter = (WebView)findViewById(R.id.web);
        WebSettings webSettings = twitter.getSettings();

        twitter.getSettings().setSupportZoom(true);
        twitter.getSettings().setLoadWithOverviewMode(true);
        twitter.getSettings().setBuiltInZoomControls(true);

        webSettings.setJavaScriptEnabled(true);
        twitter.loadUrl("https://twitter.com/fbla_national?lang=en");
        twitter.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if (twitter.canGoBack()){
            twitter.goBack();
        } else
            super.onBackPressed();
    }
}
