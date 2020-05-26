package com.example.fbla_project3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class insta extends AppCompatActivity {
    private WebView instagram;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insta);
        setTitle("Instagram");

        instagram = (WebView)findViewById(R.id.web);
        WebSettings webSettings = instagram.getSettings();

        instagram.getSettings().setSupportZoom(true);
        instagram.getSettings().setLoadWithOverviewMode(true);
        instagram.getSettings().setBuiltInZoomControls(true);

        webSettings.setJavaScriptEnabled(true);
        instagram.loadUrl("https://www.instagram.com/fbla_pbl/?hl=en");
        instagram.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if (instagram.canGoBack()){
            instagram.goBack();
        } else
            super.onBackPressed();
    }
}
