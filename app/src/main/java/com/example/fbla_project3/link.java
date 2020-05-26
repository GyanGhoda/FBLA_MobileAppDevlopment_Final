package com.example.fbla_project3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class link extends AppCompatActivity {
    private WebView link;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link);
        setTitle("Linkedin");

        link = (WebView)findViewById(R.id.web);
        WebSettings webSettings = link.getSettings();

        link.getSettings().setSupportZoom(true);
        link.getSettings().setLoadWithOverviewMode(true);
        link.getSettings().setBuiltInZoomControls(true);

        webSettings.setJavaScriptEnabled(true);
        link.loadUrl("https://www.linkedin.com/company/fbla-pbl");
        link.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if (link.canGoBack()) {
            link.goBack();
        } else
            super.onBackPressed();
    }
}
