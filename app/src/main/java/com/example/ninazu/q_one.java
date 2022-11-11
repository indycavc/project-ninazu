package com.example.ninazu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class q_one extends AppCompatActivity implements View.OnClickListener{

    Button btnY1, btnN1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qone);

        btnY1 = findViewById(R.id.btn_Y1);
        btnN1 = findViewById(R.id.btn_N1);

        btnY1.setOnClickListener(this);
        btnN1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == btnY1){
            Intent intent = new Intent(this, ans1.class);
            startActivity(intent);
        } else if (v == btnN1){
            Intent intent = new Intent(this, q_two.class);
            startActivity(intent);
        }
    }
}