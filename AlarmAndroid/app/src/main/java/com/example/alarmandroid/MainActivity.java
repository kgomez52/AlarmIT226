package com.example.alarmandroid;

import android.support.v7.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1=(Button)findViewById(R.id.alarmButton);
        Button b2=(Button)findViewById(R.id.timerButton);
        Button b3= (Button) findViewById(R.id.locationButton);
    }

    public void onClick(View v){
        Intent alarm = new Intent(MainActivity.this, alarm_page.class);
        startActivity(alarm);

    }

    public void timeClick(View v){
        Intent timer = new Intent(MainActivity.this, MainTimer.class);
        startActivity(timer);
    }

    public void locationClick (View v){
        Intent location = new Intent(MainActivity.this, location_page.class);
        startActivity(location);
    }


}
