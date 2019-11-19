package com.anish.esoftwarica.Activity;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.anish.esoftwarica.Fragments.fragmentAboutus;
import com.anish.esoftwarica.Fragments.fragmentAddstd;
import com.anish.esoftwarica.Fragments.fragmentHome;
import com.anish.esoftwarica.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DashboardActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navView);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navView= new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(MenuItem menuItem) {
            Fragment selectedFragment = null;
            switch (menuItem.getItemId()) {
                case R.id.homeNav:
                    selectedFragment = new fragmentHome();
                    break;

                case R.id.addsNav:
                    selectedFragment = new fragmentAddstd();
                    break;

                case R.id.aboutNav:
                    selectedFragment = new fragmentAboutus();
                    break;

            }

            getSupportFragmentManager().beginTransaction().replace(R.id.FrameLt, selectedFragment).commit();
            return true;
        }


    };
};