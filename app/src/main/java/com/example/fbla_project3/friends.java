package com.example.fbla_project3;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;

import android.graphics.Color;
//import android.app.ActionBar;
import androidx.appcompat.app.ActionBar;
import com.github.sundeepk.compactcalendarview.CompactCalendarView;
import com.github.sundeepk.compactcalendarview.domain.Event;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
public class friends extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Creates the calendar
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends);
    }
}
