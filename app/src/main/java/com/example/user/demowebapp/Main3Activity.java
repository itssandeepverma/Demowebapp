package com.example.user.demowebapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener{
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        b1=(Button) findViewById(R.id.btn);
        b1.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(Main3Activity.this, Main5Activity.class);
        startActivity(intent);
        Toast.makeText(Main3Activity.this, "Welcome To This Page\n Please Login ", Toast.LENGTH_SHORT).show();
    }
}
