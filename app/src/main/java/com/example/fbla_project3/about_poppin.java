package com.example.fbla_project3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class about_poppin extends AppCompatActivity {

    private WebView about_poppin_page;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Sets up the layout of the about_fbla page
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_poppin);

        setTitle("About Poppin");

    }
    //Lets the user back out of the page
}
