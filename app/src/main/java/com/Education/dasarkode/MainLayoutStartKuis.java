package com.Education.dasarkode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.Education.dasarkode.UserInterface.Belajar.Fragment_dashboard_belajar;

public class MainLayoutStartKuis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_layout_start_kuis);
        getSupportFragmentManager().beginTransaction().replace(R.id.FragmentMenuKuis, new Fragment_dashboard_belajar()).commit();

    }
}