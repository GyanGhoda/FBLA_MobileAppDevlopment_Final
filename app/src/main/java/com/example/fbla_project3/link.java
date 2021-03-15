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
        //Sets up layout of link page
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link);
        setTitle("Linkedin");

        link = (WebView)findViewById(R.id.web);
        WebSettings webSettings = link.getSettings();

        link.getSettings().setSupportZoom(true);
        link.getSettings().setLoadWithOverviewMode(true);
        link.getSettings().setBuiltInZoomControls(true);
        //Loads the URL for the Linkedin
        webSettings.setJavaScriptEnabled(true);
        link.loadUrl("https://www.linkedin.com");
        link.setWebViewClient(new WebViewClient());
    }

    @Override
    //Lets the user back out of the page
    public void onBackPressed() {
        if (link.canGoBack()) {
            link.goBack();
        } else
            super.onBackPressed();
    }
}
