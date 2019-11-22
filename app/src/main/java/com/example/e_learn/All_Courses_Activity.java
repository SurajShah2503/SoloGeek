package com.example.e_learn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.widget.CardView;
import android.view.View;

public class All_Courses_Activity extends AppCompatActivity {

    CardView cardViewCpp;
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
        setContentView(R.layout.activity_all__courses_);

        cardViewCpp=findViewById(R.id.cv_cpp);
        cardViewCpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(All_Courses_Activity.this,SubTopics_Activity.class);
                startActivity(intent);
            }
        });
    }
}
