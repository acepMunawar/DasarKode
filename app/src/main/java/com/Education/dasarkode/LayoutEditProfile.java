package com.Education.dasarkode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class LayoutEditProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_edit_profile);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentEditProf, new EditProfile()).commit();
    }
}