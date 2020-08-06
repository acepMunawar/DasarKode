package com.Education.dasarkode.UserInterface.Belajar.python;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.Education.dasarkode.FragmentMenuMateriPython;
import com.Education.dasarkode.R;

public class menuBelajarPython extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_belajar_python);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentLayoutBelajarPython, new FragmentMenuMateriPython()).commit();
    }
}
