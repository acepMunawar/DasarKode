package com.education.dasarkode.UserInterface.Belajar.js;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.education.dasarkode.FragmentMenuMateriJs;
import com.education.dasarkode.R;

public class menuBelajarJs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_belajar_js);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentLayoutBelajarJs, new FragmentMenuMateriJs()).commit();
        BtnImage();
    }

    public void BtnImage(){
        ImageButton btnJs = (ImageButton) findViewById(R.id.back);
        btnJs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                moveTaskToBack(true);
                startActivity(new Intent(menuBelajarJs.this, menuBelajarJs.class));
                finish();
            }
        });
    }
}
