package com.example.fbla_project3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bugs extends AppCompatActivity {
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Sets up the layout of the bug page
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bugs);
        //Sets up the submit button
        submit = (Button)findViewById(R.id.submit);
        //Submits the bug report to app
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_submit = new Intent(bugs.this, MainActivity.class);
                startActivity(intent_submit);
            }
        });
    }
}
