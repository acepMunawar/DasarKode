package com.education.dasarkode.UserInterface.Belajar.cpp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.education.dasarkode.FragmentMenuMateriCpp;
import com.education.dasarkode.R;

public class menuBelajarCpp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_belajar_cpp);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentLayoutBelajarCpp, new FragmentMenuMateriCpp()).commit();
    }

}
