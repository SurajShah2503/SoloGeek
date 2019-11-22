package com.example.e_learn;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

public class DashBoardLayout extends AppCompatActivity {

    DrawerLayout drawerLayout;
    Toolbar toolbar;
    ActionBarDrawerToggle actionBarDrawerToggle;
    NavigationView navigationView;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        if(AppCompatDelegate.getDefaultNightMode()==AppCompatDelegate.MODE_NIGHT_YES){
            setTheme(R.style.darktheme);
        }
        else{
            setTheme(R.style.AppTheme);
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board_layout);
        setupToolbar();
        navigationView = findViewById(R.id.navigationview_menu);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                boolean flag=false;
                switch (menuItem.getItemId()) {
                    case R.id.nav_course:
                        intent = new Intent(DashBoardLayout.this, All_Courses_Activity.class);
                        flag=true;
                        break;
                    case R.id.nav_profile:
                        intent=new Intent(DashBoardLayout.this,myProfile.class);
                        flag=true;
                        break;
                    case R.id.nav_logout:
                        intent=new Intent(DashBoardLayout.this,loginPageActivity.class);
                        flag=true;
                        break;
                    case R.id.nav_settings:
                        intent=new Intent(DashBoardLayout.this,Settings.class);
                        flag=true;
                        break;
                    case R.id.nav_rating:
                        Toast.makeText(DashBoardLayout.this,"Do Rating on Playstore... Thank You!",Toast.LENGTH_LONG).show();
                        break;
                    case R.id.nav_aboutus:
                        Toast.makeText(DashBoardLayout.this,"SoloGeek Version 1.0.12 beta",Toast.LENGTH_LONG).show();
                        break;
                    case R.id.nav_home:
                        intent=new Intent(DashBoardLayout.this,DashBoardLayout.class);
                        flag=true;
                        break;
                }

                if(flag)
                    startActivity(intent);

                return false;
            }
        });
    }

    private void setupToolbar() {
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.dashboard, R.string.app_name);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
    }
}