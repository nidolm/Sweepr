package com.example.sweeprapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Oops extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oops);
        getSupportActionBar().hide();

        ImageButton astleyshoe = findViewById(R.id.astleyshoe);

        astleyshoe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Oops.this,MainActivity.class));

            }
        });
    }
}