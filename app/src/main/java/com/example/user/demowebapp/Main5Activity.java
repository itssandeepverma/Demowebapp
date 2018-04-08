package com.example.user.demowebapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity implements View.OnClickListener {

    Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        b2=(Button) findViewById(R.id.button);
        b2.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(Main5Activity.this, LoginActivity.class);
        startActivity(intent);
        Toast.makeText(Main5Activity.this, "Welcome To Login Page\n Please Login To Enter", Toast.LENGTH_SHORT).show();
    }

}
