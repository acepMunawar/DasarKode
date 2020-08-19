package com.Education.dasarkode.UserInterface.Belajar.mysql;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.Education.dasarkode.FragmentMenuMateriMsyql;
import com.Education.dasarkode.R;
import com.Education.dasarkode.UserInterface.Belajar.Java.FragmentMenuJava;
import com.Education.dasarkode.UserInterface.Belajar.Java.menuBelajarJava;

public class menuBelajarMysql extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_belajar_mysql);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentLayoutBelajarMysql, new FragmentMenuMateriMsyql()).commit();
    BtnImage();
    }

    public void BtnImage(){
        ImageButton btnMysql = (ImageButton) findViewById(R.id.back);
        btnMysql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menuBelajarMysql.this, menuBelajarMysql.class));
                finish();
            }
        });
    }
}
