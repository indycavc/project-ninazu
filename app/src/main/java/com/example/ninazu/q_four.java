package com.example.ninazu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class q_four extends AppCompatActivity implements View.OnClickListener{

    Button btnY4, btnN4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qfour);

        btnY4 = findViewById(R.id.btn_Y4);
        btnN4 = findViewById(R.id.btn_N4);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        btnY4.setOnClickListener(this);
        btnN4.setOnClickListener(this);
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
        if (v == btnY4){
            Intent intent = new Intent(this, ans4.class);
            startActivity(intent);
        } else if (v == btnN4){
            Intent intent = new Intent(this, q_five.class);
            startActivity(intent);
        }
    }
}