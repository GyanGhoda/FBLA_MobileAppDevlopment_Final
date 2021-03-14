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
        //Sets up the layout of the about_fbla page
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_fbla);

        setTitle("About FBLA");

        about_fbla_page = (WebView)findViewById(R.id.about_fbla_page);
        WebSettings webSettings = about_fbla_page.getSettings();

        about_fbla_page.getSettings().setSupportZoom(true);
        about_fbla_page.getSettings().setLoadWithOverviewMode(true);
        about_fbla_page.getSettings().setBuiltInZoomControls(true);
        //Loads the URL for the About FBLA page
        webSettings.setJavaScriptEnabled(true);
        about_fbla_page.loadUrl("https://www.fbla-pbl.org/fbla/");
        about_fbla_page.setWebViewClient(new WebViewClient());
    }

    @Override
    //Lets the user back out of the page
    public void onBackPressed() {
        if (about_fbla_page.canGoBack()){
            about_fbla_page.goBack();
        } else
            super.onBackPressed();
    }
}
