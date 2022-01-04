package com.example.balansag_myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.Settings;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView iv_yeet = findViewById(R.id.iv_yeet);
        AnimationDrawable animationDrawable = (AnimationDrawable) iv_yeet.getDrawable();
        animationDrawable.start();

        MediaPlayer player = MediaPlayer.create(this, R.raw.clear_water);
        player.setLooping(true);
        player.start();
    }
}