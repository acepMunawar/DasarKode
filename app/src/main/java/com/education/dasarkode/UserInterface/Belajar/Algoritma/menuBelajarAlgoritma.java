package com.education.dasarkode.UserInterface.Belajar.Algoritma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.education.dasarkode.R;

public class menuBelajarAlgoritma extends AppCompatActivity {
    Button btnFirstMateri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_belajar_algoritma);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentLayoutBelajarAlgoritma, new FragmentMenuMateriAlgoritma()).commit();

    }


}
