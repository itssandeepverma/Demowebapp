package com.example.user.demowebapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Spalashscreen extends AppCompatActivity {
    private static int WElCOME_TIMEOUT= 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalashscreen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent=new Intent(Spalashscreen.this,Main3Activity.class);
                startActivity(homeIntent);
                finish();
            }
        },WElCOME_TIMEOUT);
    }
}
