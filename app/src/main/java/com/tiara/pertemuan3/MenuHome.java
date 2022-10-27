package com.tiara.pertemuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;



public class MenuHome extends AppCompatActivity {


    protected void onCreate(android.os.Bundle SavedInstanceState) {

    }


    @Override
    protected void onStop() { super.onStop();
        Toast.makeText(this, "Application On Stop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() { super.onRestart();
        Toast.makeText(this, "Application On Restart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() { super.onResume();
        Toast.makeText(this, "Application On Resume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() { super.onPause();
        Toast.makeText(this, "Application On Pause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() { super.onDestroy();
        Toast.makeText(this, "Application On Destroy", Toast.LENGTH_SHORT).show();
    }


}