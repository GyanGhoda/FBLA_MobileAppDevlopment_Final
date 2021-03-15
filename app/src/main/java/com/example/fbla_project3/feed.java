package com.example.fbla_project3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class feed extends AppCompatActivity {

    private WebView contact_fbla_page;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Sets the layout of the feed page
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);
    }
}
