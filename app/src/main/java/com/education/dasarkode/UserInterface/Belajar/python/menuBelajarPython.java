package com.education.dasarkode.UserInterface.Belajar.python;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.education.dasarkode.FragmentMenuMateriPython;
import com.education.dasarkode.R;
import com.education.dasarkode.UserInterface.Belajar.Fragment_dashboard_belajar;

public class menuBelajarPython extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_belajar_python);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentLayoutBelajarPython, new FragmentMenuMateriPython()).commit();
    }
}

