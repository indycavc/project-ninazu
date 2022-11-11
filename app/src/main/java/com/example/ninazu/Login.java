package com.example.ninazu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity implements View.OnClickListener{

    EditText etUsername, etPassword;
    TextView tvErrMsg;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = findViewById(R.id.et_username);
        etPassword = findViewById(R.id.et_password);
        tvErrMsg = findViewById(R.id.tv_errMsg);
        btnLogin = findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == btnLogin){
            String username = etUsername.getText().toString();
            String password = etPassword.getText().toString();

            if(username.isEmpty()){
                tvErrMsg.setText("Email must be filled");
                tvErrMsg.setVisibility(View.VISIBLE);
            } else if (password.isEmpty()){
                tvErrMsg.setText("Password must be filled");
                tvErrMsg.setVisibility(View.VISIBLE);
            } else {
                tvErrMsg.setVisibility(View.INVISIBLE);
                Intent intent = new Intent(this,q_one.class);
                startActivity(intent);
            }

        }
    }
}