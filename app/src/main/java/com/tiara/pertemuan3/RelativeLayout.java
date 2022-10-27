package com.tiara.pertemuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RelativeLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);
        Button buttonexplicit=(Button) findViewById(R.id.button3);
        Button buttonimplicit=(Button) findViewById(R.id.button4);



    buttonexplicit.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i=new Intent(getApplicationContext(), MainActivity.class);
            startActivity(i);
        }
    });

    buttonimplicit.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.iweblogsite.com"));
            startActivity(implicit);
        }


        public void onBackPressed() {
            RelativeLayout.super.onBackPressed();
            finish();

        }
    });



    }
}