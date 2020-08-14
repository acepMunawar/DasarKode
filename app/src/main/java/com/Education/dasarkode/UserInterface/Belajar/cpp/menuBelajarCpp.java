package com.Education.dasarkode.UserInterface.Belajar.cpp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.Education.dasarkode.FragmentMenuMateriCpp;
import com.Education.dasarkode.R;
import com.Education.dasarkode.UserInterface.Belajar.Java.FragmentMenuJava;

public class menuBelajarCpp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_belajar_cpp);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentLayoutBelajarCpp, new FragmentMenuMateriCpp()).commit();
    } 
}
