package com.example.xylophoneapp;

import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.xylophoneapp.R.raw.note1_c;

public class MainActivity extends AppCompatActivity {

    Button red , blue,yellow , green , orange , offblack , sky , purple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        red = findViewById(R.id.red_btn);
        blue = findViewById(R.id.blue_btn);
        purple = findViewById(R.id.purple_btn);
        green = findViewById(R.id.green_btn);
        orange = findViewById(R.id.orange_btn);
        yellow = findViewById(R.id.yellow_btn);
        sky = findViewById(R.id.sky_btn);
        offblack = findViewById(R.id.offblack_btn);



        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer =   MediaPlayer.create(MainActivity.this,R.raw.note7_b);
                mediaPlayer.start();
            }
        });
        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer =   MediaPlayer.create(MainActivity.this,R.raw.note2_d);
                mediaPlayer.start();
            }
        });
        purple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer =   MediaPlayer.create(MainActivity.this, note1_c);
                mediaPlayer.start();
            }
        });
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer =   MediaPlayer.create(MainActivity.this,R.raw.note3_e);
                mediaPlayer.start();
            }
        });
        orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer =   MediaPlayer.create(MainActivity.this,R.raw.note4_f);
                mediaPlayer.start();
            }
        });
        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer =   MediaPlayer.create(MainActivity.this,R.raw.note5_g);
                mediaPlayer.start();
            }
        });
        sky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer =   MediaPlayer.create(MainActivity.this,R.raw.note6_a);
                mediaPlayer.start();
            }
        });
        offblack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer =   MediaPlayer.create(MainActivity.this,R.raw.note7_b);
                mediaPlayer.start();
            }
        });
    }
}
