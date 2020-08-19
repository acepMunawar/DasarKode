package com.education.dasarkode.UserInterface.Belajar.python;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.education.dasarkode.FragmentMenuMateriPython;
import com.education.dasarkode.R;

public class menuBelajarPython extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_belajar_python);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentLayoutBelajarPython, new FragmentMenuMateriPython()).commit();
        BtnImage();
    }

    public void BtnImage(){
        ImageButton btnPy = (ImageButton) findViewById(R.id.back);
        btnPy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menuBelajarPython.this, menuBelajarPython.class));
                finish();
            }
        });
    }
}
