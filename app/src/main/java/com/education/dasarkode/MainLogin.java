package com.education.dasarkode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentLogin, new Login()).commit();
    }
}
