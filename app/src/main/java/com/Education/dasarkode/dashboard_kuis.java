package com.Education.dasarkode;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class dashboard_kuis extends AppCompatActivity {
    BottomNavigationView bottomNavigationView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_kuis);
        Fragment_dashboard_kuis fdk = new Fragment_dashboard_kuis();
        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction().add(R.id.fragmentDashboardKuis,fdk).commit();
//        btmNav();
    }

    public void btmNav(){
        bottomNavigationView = findViewById(R.id.nav_bottom_kuis);
        bottomNavigationView.setSelectedItemId(R.id.fragmentDashboardKuis);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nav_belajar:
                        Intent intentBelajar = new Intent(dashboard_kuis.this,dashboard_belajar.class);
                        startActivity(intentBelajar);
                        overridePendingTransition(0,0);
                        break;
                    case R.id.nav_kuis:
                        Intent intentKuis = new Intent(dashboard_kuis.this,dashboard_kuis.class);
                        startActivity(intentKuis);
                        overridePendingTransition(0,0);
                        break;
                    case R.id.nav_info:
                        Intent intentInfo = new Intent(dashboard_kuis.this,dashboard_info.class);
                        startActivity(intentInfo);
                        overridePendingTransition(0,0);
                        break;
                    case R.id.nav_user:
                        Intent intentUser = new Intent(dashboard_kuis.this,dashboard_user.class);
                        startActivity(intentUser);
                        overridePendingTransition(0,0);
                        break;
                }
                return false;
            }
        });
    }

}
