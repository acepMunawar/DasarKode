package com.Education.dasarkode;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.Education.dasarkode.UserInterface.Belajar.Fragment_dashboard_belajar;
import com.Education.dasarkode.UserInterface.Info.Fragment_dashboard_info;
import com.Education.dasarkode.UserInterface.profile.Fragment_dashboard_profile;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNav = findViewById(R.id.nav_bottom_dasarkode);
        bottomNav.setOnNavigationItemSelectedListener(navListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentDashboardBelajar, new Fragment_dashboard_belajar()).commit();


    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;
                    switch (item.getItemId()){
                        case R.id.nav_belajar:
                            selectedFragment = new Fragment_dashboard_belajar();
                            break;
                        case R.id.nav_kuis:
                            selectedFragment = new MainKuis();
                            break;
                        case R.id.nav_info:
                            selectedFragment = new Fragment_dashboard_info();
                            break;
                        case R.id.nav_user:
                            selectedFragment = new Fragment_dashboard_profile();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragmentDashboardBelajar,selectedFragment).commit();
                    return true;
                }
            };
}
