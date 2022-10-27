package com.tiara.pertemuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {

            //Ketik dari sini
            @Override
            public void run() {
                Intent i = new Intent(Splash.this, RelativeLayout.class);
                startActivity(i);
                finish();
            }
        }, 5000);

    }


}