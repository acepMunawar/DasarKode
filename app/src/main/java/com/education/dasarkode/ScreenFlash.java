package com.education.dasarkode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.google.firebase.auth.FirebaseAuth;

public class ScreenFlash extends AppCompatActivity {
    private int duration = 2000;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_flash);
        firebaseAuth = FirebaseAuth.getInstance();
        screenSplash();
    }

    public void screenSplash() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (firebaseAuth.getCurrentUser() != null) {
                    Intent main = new Intent(ScreenFlash.this, MainActivity.class);
                    startActivity(main);
                    finish();
                    return;
                }

                Intent home = new Intent(ScreenFlash.this, MainLogin.class);
                startActivity(home);
                finish();
            }
            }, duration);
    }

}
