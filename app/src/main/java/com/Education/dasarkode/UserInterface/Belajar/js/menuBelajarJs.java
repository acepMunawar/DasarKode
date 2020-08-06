package com.Education.dasarkode.UserInterface.Belajar.js;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.Education.dasarkode.FragmentMenuMateriJs;
import com.Education.dasarkode.R;
import com.Education.dasarkode.UserInterface.Belajar.Java.FragmentMenuJava;

public class menuBelajarJs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_belajar_js);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentLayoutBelajarJs, new FragmentMenuMateriJs()).commit();
    }
}
