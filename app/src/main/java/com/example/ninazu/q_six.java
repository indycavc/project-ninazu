package com.example.ninazu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class q_six extends AppCompatActivity implements View.OnClickListener {

    Button btnY6, btnN6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qsix);

        btnY6 = findViewById(R.id.btn_Y6);
        btnN6 = findViewById(R.id.btn_N6);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        btnY6.setOnClickListener(this);
        btnN6.setOnClickListener(this);
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
        if (v == btnY6){
            Intent intent = new Intent(this, ans6.class);
            startActivity(intent);
        } else if (v == btnN6){
            Intent intent = new Intent(this, ans7.class);
            startActivity(intent);
        }
    }
}