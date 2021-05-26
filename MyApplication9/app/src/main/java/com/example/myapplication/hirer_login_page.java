package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class hirer_login_page extends AppCompatActivity {
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hirer_login_page);

        configureloginButton1();
        configureregisterHere1();
    }

    private void configureregisterHere1() {
        TextView registerHere1 = (TextView) findViewById(R.id.registerHere1);
        registerHere1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(hirer_login_page.this, client_side_page_1.class));
            }
        });
    }

    private void configureloginButton1() {
        Button loginButton1 = (Button) findViewById(R.id.loginButton1);
        loginButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(hirer_login_page.this, skilled_person_selection_page.class));
            }
        });
    }
}
