package com.example.fbla_project3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class about_fbla extends AppCompatActivity {

    private WebView about_fbla_page;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_fbla);

        setTitle("About FBLA");

        about_fbla_page = (WebView)findViewById(R.id.about_fbla_page);
        WebSettings webSettings = about_fbla_page.getSettings();

        about_fbla_page.getSettings().setSupportZoom(true);
        about_fbla_page.getSettings().setLoadWithOverviewMode(true);
        about_fbla_page.getSettings().setBuiltInZoomControls(true);

        webSettings.setJavaScriptEnabled(true);
        about_fbla_page.loadUrl("https://www.fbla-pbl.org/fbla/");
        about_fbla_page.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if (about_fbla_page.canGoBack()){
            about_fbla_page.goBack();
        } else
            super.onBackPressed();
    }
}
