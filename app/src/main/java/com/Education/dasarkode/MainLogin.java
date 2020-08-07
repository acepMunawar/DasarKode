package com.Education.dasarkode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.Education.dasarkode.UserInterface.Belajar.Fragment_dashboard_belajar;

public class MainLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentLogin, new Login()).commit();
    }
}