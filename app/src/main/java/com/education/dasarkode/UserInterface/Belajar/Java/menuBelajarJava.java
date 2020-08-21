package com.education.dasarkode.UserInterface.Belajar.Java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.education.dasarkode.R;

public class menuBelajarJava extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_belajar_java);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentLayoutBelajarJava, new FragmentMenuJava()).commit();
        BtnImage();
    }

    public void BtnImage(){
        ImageButton btnJava = (ImageButton) findViewById(R.id.back);
        btnJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menuBelajarJava.this, menuBelajarJava.class));
                finish();
            }
        });
    }


}
