package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Arrays;

public class client_side_page_1 extends AppCompatActivity {

    Spinner state1,city1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_side_page_1);

        state1 = findViewById(R.id.state1);
        city1 = findViewById(R.id.city1);



        String[] states1 = {"Select Your state","Andhra Pradesh","Arunachal Pradesh","Assam","Bihar"};
        ArrayList<String> arrayListStates1 = new ArrayList<>(Arrays.asList(states1));
        ArrayAdapter<String> arrayAdapterStates1 = new ArrayAdapter<>(this,R.layout.style_spinner,arrayListStates1);
        state1.setAdapter(arrayAdapterStates1);

        String[] cities1 = {"Select Your city","ABCD","XYZ","PQRST","IJKL"};
        ArrayList<String> arrayListCities1 = new ArrayList<>(Arrays.asList(cities1));
        ArrayAdapter<String> arrayAdapterCities1 = new ArrayAdapter<>(this,R.layout.style_spinner,arrayListCities1);
        city1.setAdapter(arrayAdapterCities1);

        configurebutton4();
        configurebutton3();
    }
    private void configurebutton4(){
        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(client_side_page_1.this, skilled_person_selection_page.class));
            }
        });
    }
    private void configurebutton3(){
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(client_side_page_1.this, hirer_login_page.class));
            }
        });
    }
}