package com.education.dasarkode.UserInterface.Belajar.Java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.education.dasarkode.FragmentMenuJava;
import com.education.dasarkode.R;

public class menuBelajarJava extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_belajar_java);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentLayoutBelajarJava, new FragmentMenuJava()).commit();
    }

}
