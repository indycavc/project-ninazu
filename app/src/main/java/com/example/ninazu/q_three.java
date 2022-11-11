package com.example.ninazu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class q_three extends AppCompatActivity implements View.OnClickListener {

    Button btnY3, btnN3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qthree);

        btnY3 = findViewById(R.id.btn_Y3);
        btnN3 = findViewById(R.id.btn_N3);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        btnY3.setOnClickListener(this);
        btnN3.setOnClickListener(this);
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
        if (v == btnY3){
            Intent intent = new Intent(this, ans3.class);
            startActivity(intent);
        } else if (v == btnN3){
            Intent intent = new Intent(this, q_four.class);
            startActivity(intent);
        }
    }
}