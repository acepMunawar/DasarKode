package com.Education.dasarkode;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class dashboard_user extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_user);
//        navUser();
    }

    public void navUser(){
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.nav_bottom_user);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId())
                {
                    case R.id.nav_belajar:
                        Intent intentBelajar = new Intent(dashboard_user.this, dashboard_belajar.class);
                        startActivity(intentBelajar);
                        break;
                    case R.id.nav_kuis:
                        Intent intentKuis = new Intent(dashboard_user.this, dashboard_kuis.class);
                        startActivity(intentKuis);
                        break;
                    case R.id.nav_info:
                        Intent intentInfo = new Intent(dashboard_user.this, dashboard_info.class);
                        startActivity(intentInfo);
                        break;
                    case R.id.nav_user:
                        Intent intentUser = new Intent(dashboard_user.this, dashboard_info.class);
                        startActivity(intentUser);
                        break;
                }

                return false;
            }
        });
    }
}
