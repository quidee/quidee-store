package com.example.quideestore;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class LoginScreenActivity extends AppCompatActivity {

    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_screen_login);

        //TODO: Create all the logic

        btnLogin = findViewById(R.id.btn_sign_in);

        //to test
        btnLogin.setOnClickListener(v -> {
            Intent intent = new Intent(LoginScreenActivity.this, ChangePasswordActivity.class);
            startActivity(intent);
        });



    }
}