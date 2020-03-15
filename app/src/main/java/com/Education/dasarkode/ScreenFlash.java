package com.Education.dasarkode;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class ScreenFlash extends AppCompatActivity {
    private int duration = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_flash);
        screenSplash();
    }

    public void screenSplash(){
        new Handler().postDelayed(new Runnable() {
                                      @Override
                                      public void run() {
                                          Intent home =new Intent(ScreenFlash.this, dashboard_belajar.class);
                                          startActivity(home);
                                          finish();
                                      }
                                  },duration
        );
    }


    }
