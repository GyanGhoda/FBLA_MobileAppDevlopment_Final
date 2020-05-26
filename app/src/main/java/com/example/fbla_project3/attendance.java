package com.example.fbla_project3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class attendance extends AppCompatActivity {

    private WebView attendance_form;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        setTitle("Attendance");

        attendance_form = (WebView)findViewById(R.id.web);
        WebSettings webSettings = attendance_form.getSettings();

        attendance_form.getSettings().setSupportZoom(true);
        attendance_form.getSettings().setLoadWithOverviewMode(true);
        attendance_form.getSettings().setBuiltInZoomControls(true);

        webSettings.setJavaScriptEnabled(true);
        attendance_form.loadUrl("https://gyanghoda.github.io/android_attendance/");
        attendance_form.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if (attendance_form.canGoBack()){
            attendance_form.goBack();
        } else
            super.onBackPressed();
    }
}