package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class job_role_selection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_role_selection);

        configurebutton6();
        configurebutton5();
    }
    private void configurebutton6(){
        Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(job_role_selection.this, client_side_page_1.class));
            }
        });
    }
    private void configurebutton5(){
        Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(job_role_selection.this, client_side_page_2.class));
            }
        });
    }
}