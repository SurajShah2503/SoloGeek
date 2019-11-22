package com.example.e_learn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import android.widget.Button;

public class loginPageActivity extends AppCompatActivity {

    Button Btn_forgotpassword,Btn_Signin,Btn_signup;
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
        setContentView(R.layout.activity_login_page);

        Btn_forgotpassword=this.<Button>findViewById(R.id.btn_forgotpass);
        Btn_forgotpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(loginPageActivity.this,forgotpassword.class);
                startActivity(intent);
            }
        });

        Btn_Signin=findViewById(R.id.btn_signin);
        Btn_Signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(loginPageActivity.this,DashBoardLayout.class);
                startActivity(intent);
            }
        });

        Btn_signup=findViewById(R.id.btn_signup);
        Btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(loginPageActivity.this,Registration_Activity.class);
                startActivity(intent);
            }
        });
    }
}
