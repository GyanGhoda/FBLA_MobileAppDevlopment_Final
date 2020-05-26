package com.example.fbla_project3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Toast;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
public class sign_up extends AppCompatActivity {
    private WebView signup_form;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Sets the layout of the sign_up page
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        setTitle("Sign Up");

        signup_form = (WebView)findViewById(R.id.web);
        WebSettings webSettings = signup_form.getSettings();

        signup_form.setInitialScale(200);
        signup_form.getSettings().setSupportZoom(true);
        signup_form.getSettings().setLoadWithOverviewMode(true);
        signup_form.getSettings().setBuiltInZoomControls(true);
        //Loads the google form for the page
        webSettings.setJavaScriptEnabled(true);
        signup_form.loadUrl("https://docs.google.com/forms/d/1p5JbgiGg-ncnqqoHhOUQ036-mmbmCrz4T5FHyD_obP8");
        signup_form.setWebViewClient(new WebViewClient());
    }

    @Override
    //Lets the user back out of page
    public void onBackPressed() {
        if (signup_form.canGoBack()){
            signup_form.goBack();
        } else
            super.onBackPressed();
    }
}
