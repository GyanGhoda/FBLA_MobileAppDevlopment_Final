package com.example.fbla_project3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button about_fbla;
    private Button calendar;
    private Button sign_up;
    private Button attendance;
    private Button contact_fbla;
    private ImageButton insta;
    private ImageButton twitter;
    private ImageButton facebook;
    private ImageButton link;
    private TextView terms;
    private TextView bugs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Sets layout of the Home page
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Instantiates all of the buttons on the page
        about_fbla = (Button)findViewById(R.id.about_fbla);
        calendar = (Button)findViewById(R.id.calendar);
        sign_up = (Button)findViewById(R.id.sign_up);
        attendance = (Button)findViewById(R.id.attendance);
        contact_fbla = (Button)findViewById(R.id.contact_fbla);
        insta = (ImageButton)findViewById(R.id.insta);
        twitter = (ImageButton)findViewById(R.id.twitter);
        link = (ImageButton)findViewById(R.id.linkedin);
        facebook = (ImageButton)findViewById(R.id.facebook);
        terms = (TextView)findViewById(R.id.terms_service);
        bugs = (TextView)findViewById(R.id.bugs);
        //Sets up the intents and listeners for each of the buttons
        about_fbla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_about_fbla = new Intent(MainActivity.this, about_poppin.class);
                startActivity(intent_about_fbla);
            }
        });
        calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_calendar = new Intent(MainActivity.this, friends.class);
                startActivity(intent_calendar);
            }
        });
        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_sign_up = new Intent(MainActivity.this, profile.class);
                startActivity(intent_sign_up);
            }
        });
        attendance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_attendance = new Intent(MainActivity.this, code_of_ethics.class);
                startActivity(intent_attendance);
            }
        });
        contact_fbla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_contact_fbla = new Intent(MainActivity.this, feed.class);
                startActivity(intent_contact_fbla);
            }
        });
        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_insta = new Intent(MainActivity.this, insta.class);
                startActivity(intent_insta);
            }
        });
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_twitter = new Intent(MainActivity.this, twitter.class);
                startActivity(intent_twitter);
            }
        });
        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_link = new Intent(MainActivity.this, link.class);
                startActivity(intent_link);
            }
        });
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_facebook = new Intent(MainActivity.this, facebook.class);
                startActivity(intent_facebook);
            }
        });
        terms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_terms = new Intent(MainActivity.this, terms.class);
                startActivity(intent_terms);
            }
        });
        bugs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_bugs = new Intent(MainActivity.this, bugs.class);
                startActivity(intent_bugs);
            }
        });
    }
}
