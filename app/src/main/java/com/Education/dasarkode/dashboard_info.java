package com.Education.dasarkode;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class dashboard_info extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_info);
        Fragment_dashboard_info fdi = new Fragment_dashboard_info();
        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction().add(R.id.fragmentDashboardInfo,fdi).commit();
        btnNav();
    }

    public void btnNav(){
        bottomNavigationView = findViewById(R.id.nav_bottom_info);
        bottomNavigationView.setSelectedItemId(R.id.fragmentDashboardInfo);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId())
                {
                    case R.id.nav_belajar:
                        startActivity(new Intent(getApplicationContext(),dashboard_belajar.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.nav_kuis:
                        startActivity(new Intent(getApplicationContext(),dashboard_kuis.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.nav_info:
                        startActivity(new Intent(getApplicationContext(),dashboard_info.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.nav_user:
                        startActivity(new Intent(getApplicationContext(),dashboard_user.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }
}
