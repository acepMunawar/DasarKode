package com.Education.dasarkode.UserInterface.Belajar.Algoritma;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.Education.dasarkode.R;
import com.Education.dasarkode.UserInterface.Belajar.Algoritma.FragmentMenuMateriAlgoritma;
import com.Education.dasarkode.UserInterface.Belajar.Fragment_dashboard_belajar;
import com.Education.dasarkode.UserInterface.Belajar.Java.menuBelajarJava;

public class menuBelajarAlgoritma extends AppCompatActivity {
    Button btnFirstMateri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_belajar_algoritma);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentLayoutBelajarAlgoritma, new FragmentMenuMateriAlgoritma()).commit();
    }

    public void BtnImage(){
        ImageButton btnAlgoritma = (ImageButton) findViewById(R.id.back);
        btnAlgoritma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menuBelajarAlgoritma.this, menuBelajarAlgoritma.class));
                finish();
            }
        });
    }

}
