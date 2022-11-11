package com.example.ninazu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class q_two extends AppCompatActivity implements View.OnClickListener{

    Button btnY2, btnN2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qtwo);

        btnY2 = findViewById(R.id.btn_Y2);
        btnN2 = findViewById(R.id.btn_N2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        btnY2.setOnClickListener(this);
        btnN2.setOnClickListener(this);
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
        if (v == btnY2){
            Intent intent = new Intent(this, ans2.class);
            startActivity(intent);
        } else if (v == btnN2){
            Intent intent = new Intent(this, q_three.class);
            startActivity(intent);
        }
    }
}