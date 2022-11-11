package com.example.ninazu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class q_five extends AppCompatActivity implements View.OnClickListener{

    Button btnY5, btnN5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qfive);

        btnY5 = findViewById(R.id.btn_Y5);
        btnN5 = findViewById(R.id.btn_N5);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        btnY5.setOnClickListener(this);
        btnN5.setOnClickListener(this);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    public void onClick(View v) {
        if (v == btnY5){
            Intent intent = new Intent(this, ans5.class);
            startActivity(intent);
        } else if (v == btnN5){
            Intent intent = new Intent(this, q_six.class);
            startActivity(intent);
        }
    }
}