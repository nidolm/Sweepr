package com.example.sweeprapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        Button Profile = findViewById(R.id.profilebtn);
        Button Leaderboard = findViewById(R.id.leaderbrdbtn);
        Button Setting = findViewById(R.id.settingbtn);
        Button Logout = findViewById(R.id.logoutbtn);
        Button Sweepr = findViewById(R.id.sweepbtn);


        Profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ProfileScreen.class));

            }
        });

        Leaderboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Leaderboard.class));
            }
        });

        Setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Oops.class));
            }
        });

        Logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,LoginScreen.class));
                finish();
            }
        });

        Sweepr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Oops.class));
            }
        });

    }
}

