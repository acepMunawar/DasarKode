package com.education.dasarkode.UserInterface.Belajar.mysql;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.education.dasarkode.FragmentMenuMateriMsyql;
import com.education.dasarkode.R;

public class menuBelajarMysql extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_belajar_mysql);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentLayoutBelajarMysql, new FragmentMenuMateriMsyql()).commit();
    }
}

