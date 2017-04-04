package com.toshihiro.geometryphotos;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;

import ssru.toshihiro.geometryphoto.R;

public class Splash extends Activity {

    Handler handler;
    Runnable runnable;
    long delay_time;
    long time = 4000;
    long time2 = 1000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        final MediaPlayer mediaPlayer = MediaPlayer.create(Splash.this, R.raw.start_up);
        mediaPlayer.start();

        handler = new Handler();

        runnable = new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash.this, Main2Activity.class);
                startActivity(intent);

                finish();
            }
        };
    }

    @Override
    protected void onResume() {
        super.onResume();

        delay_time = time;
        handler.postDelayed(runnable, delay_time);
        time = System.currentTimeMillis();
    }

    @Override
    protected void onPause() {
        super.onPause();
        handler.removeCallbacks(runnable);
        time = delay_time - (System.currentTimeMillis() - time);

    }
}
