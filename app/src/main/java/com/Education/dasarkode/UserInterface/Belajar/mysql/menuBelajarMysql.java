package com.Education.dasarkode.UserInterface.Belajar.mysql;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.Education.dasarkode.FragmentMenuMateriMsyql;
import com.Education.dasarkode.R;
import com.Education.dasarkode.UserInterface.Belajar.Java.FragmentMenuJava;

public class menuBelajarMysql extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_belajar_mysql);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentLayoutBelajarMysql, new FragmentMenuMateriMsyql()).commit();
    }
}
