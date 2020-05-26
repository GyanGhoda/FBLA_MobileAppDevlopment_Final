package com.example.fbla_project3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class contact_fbla extends AppCompatActivity {

    private WebView contact_fbla_page;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Sets the layout of the contact_fbla page
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_fbla);

        setTitle("Contact FBLA");

        contact_fbla_page = (WebView)findViewById(R.id.contact_fbla_page);
        WebSettings webSettings = contact_fbla_page.getSettings();

        contact_fbla_page.getSettings().setSupportZoom(true);
        contact_fbla_page.getSettings().setLoadWithOverviewMode(true);
        contact_fbla_page.getSettings().setBuiltInZoomControls(true);
        //gets the URL for the webpage
        webSettings.setJavaScriptEnabled(true);
        contact_fbla_page.loadUrl("https://www.fbla-pbl.org/contact/");
        contact_fbla_page.setWebViewClient(new WebViewClient());
    }

    @Override
    //Lets you back out of the page
    public void onBackPressed() {
        if (contact_fbla_page.canGoBack()) {
            contact_fbla_page.goBack();
        } else
            super.onBackPressed();
    }
}
