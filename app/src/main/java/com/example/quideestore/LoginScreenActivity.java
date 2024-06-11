package com.example.quideestore;


import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class LoginScreenActivity extends AppCompatActivity {

    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_screen_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //TODO: Create all the logic

        btnLogin = findViewById(R.id.btn_sign_in);

        //to test
        btnLogin.setOnClickListener(v -> {
            Intent intent = new Intent(LoginScreenActivity.this, NotificationActivity.class);
            startActivity(intent);

            //showPaymentSuccessfulDialog();
        });



    }

    private void showPaymentSuccessfulDialog() {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_payment_successful);


        dialog.setCancelable(true);

        Button viewOrderButton = dialog.findViewById(R.id.buttonViewOrder);
        viewOrderButton.setOnClickListener(v -> {

            dialog.dismiss();
            //Other actions here
        });

        dialog.show();
    }
}