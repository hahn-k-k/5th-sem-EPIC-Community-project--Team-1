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

public class client_side_page_2 extends AppCompatActivity {

    Spinner state,city,jobrole;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_side_page_2);

        state = findViewById(R.id.state);
        city = findViewById(R.id.city);
        jobrole = findViewById(R.id.jobroles);

        String[] states = {"Select Your state","Andhra Pradesh","Arunachal Pradesh","Assam","Bihar"};
        ArrayList<String> arrayListStates = new ArrayList<>(Arrays.asList(states));
        ArrayAdapter<String> arrayAdapterStates = new ArrayAdapter<>(this,R.layout.style_spinner,arrayListStates);
        state.setAdapter(arrayAdapterStates);

        String[] cities = {"Select Your city","ABCD","XYZ","PQRST","IJKL"};
        ArrayList<String> arrayListCities = new ArrayList<>(Arrays.asList(cities));
        ArrayAdapter<String> arrayAdapterCities = new ArrayAdapter<>(this,R.layout.style_spinner,arrayListCities);
        city.setAdapter(arrayAdapterCities);

        String[] jobroles = {"Select Your Profession","Painter","Car Driver","Mechanic","Others"};
        ArrayList<String> arrayListJobroles = new ArrayList<>(Arrays.asList(jobroles));
        ArrayAdapter<String> arrayAdapterJobroles = new ArrayAdapter<>(this,R.layout.style_spinner,arrayListJobroles);
        jobrole.setAdapter(arrayAdapterJobroles);

        configurebutton2();
        configurebutton1();
    }
    private void configurebutton2(){
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(client_side_page_2.this, profile.class));
            }
        });
    }
    private void configurebutton1(){
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(client_side_page_2.this, hiree_login_page.class));
            }
        });
    }
}