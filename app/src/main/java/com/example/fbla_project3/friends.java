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
public class calendar extends AppCompatActivity {
    //Sets up the calendar layout by instantiating the variables
    CompactCalendarView compactCalendar;
    private SimpleDateFormat dateFormatMonth = new SimpleDateFormat("MMMM- yyyy", Locale.getDefault());
    ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Creates the calendar
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        actionBar = getSupportActionBar();

        actionBar.setDisplayHomeAsUpEnabled(false);
        actionBar.setTitle(null);

        compactCalendar = (CompactCalendarView) findViewById(R.id.compactcalendar_view);
        compactCalendar.setUseThreeLetterAbbreviation(true);

        Event ev1 = new Event(Color.RED, 1477040400000L, "FBLA SLC Event");
        compactCalendar.addEvent(ev1);
        //Creates the calender dates and events
        compactCalendar.setListener(new CompactCalendarView.CompactCalendarViewListener() {
            @Override
            public void onDayClick(Date dateClicked) {
                Context context = getApplicationContext();

                if (dateClicked.toString().compareTo("Thu May 7 00:00:00 EST 2020") == 0) {
                    Toast.makeText(context, "FBLA SLC Event", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(context, "No Events Planned for that day", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            //Lets the user scroll through the calender
            public void onMonthScroll(Date firstDayOfNewMonth) {
                actionBar.setTitle(dateFormatMonth.format(firstDayOfNewMonth));
            }
        });
    }
}
