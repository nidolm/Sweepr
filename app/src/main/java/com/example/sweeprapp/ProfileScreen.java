package com.example.sweeprapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ProfileScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_screen);
        getSupportActionBar().hide();
    }
}