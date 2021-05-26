package com.example.myapplication;

import androidx.annotation.ColorRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class skilled_person_selection_page extends AppCompatActivity {

    Spinner jobrole1;

    AppCompatRadioButton rbPin,rbState,rbCity;

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<RecyclerViewClass>userList;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skilled_person_selection_page);
        jobrole1 = findViewById(R.id.jobroles1);
        rbPin = findViewById(R.id.rbPin);
        rbState = findViewById(R.id.rbState);
        rbCity = findViewById(R.id.rbCity);

        initData();
        initRecyclerView();

        String[] jobroles1 = {"Select Your Profession","Painter","Car Driver","Mechanic","Others"};
        ArrayList<String> arrayListJobroles1 = new ArrayList<>(Arrays.asList(jobroles1));
        ArrayAdapter<String> arrayAdapterJobroles1 = new ArrayAdapter<>(this,R.layout.style_spinner,arrayListJobroles1);
        jobrole1.setAdapter(arrayAdapterJobroles1);
    }

    private void initData() {
        userList = new ArrayList<>();
        userList.add(new RecyclerViewClass(R.drawable.ic_person_24,"kamlesh Dey","8902000000","Painter","__________________________________________________________"));
        userList.add(new RecyclerViewClass(R.drawable.ic_person_24,"Amrita Sher-Gill","8902099999","Painter","__________________________________________________________"));
        userList.add(new RecyclerViewClass(R.drawable.ic_person_24,"Jamini Roy","9189000000","Painter","__________________________________________________________"));
        userList.add(new RecyclerViewClass(R.drawable.ic_person_24,"Kalipada Ghoshal","9189099999","Painter","__________________________________________________________"));
        userList.add(new RecyclerViewClass(R.drawable.ic_person_24,"Maniam","9432000000 ","Painter","__________________________________________________________"));
        userList.add(new RecyclerViewClass(R.drawable.ic_person_24,"Manishi Dey","9432099999","Painter","__________________________________________________________"));
        userList.add(new RecyclerViewClass(R.drawable.ic_person_24,"Mukul Chandra Dey","9433000000","Painter","__________________________________________________________"));
        userList.add(new RecyclerViewClass(R.drawable.ic_person_24,"Nandalal Bose","9433099999","Painter","__________________________________________________________"));
        userList.add(new RecyclerViewClass(R.drawable.ic_person_24,"Rabindranath Tagore","9477000000","Painter","__________________________________________________________"));
        userList.add(new RecyclerViewClass(R.drawable.ic_person_24,"Raja Ravi Varma","9477099999","Painter","__________________________________________________________"));
        userList.add(new RecyclerViewClass(R.drawable.ic_person_24,"Silpi","8902100000","Painter","__________________________________________________________"));
        userList.add(new RecyclerViewClass(R.drawable.ic_person_24,"Sunil Das","8902199999","Painter","__________________________________________________________"));


    }

    private void initRecyclerView() {
        recyclerView=findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new Adapter(userList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    public void onRadioButtonClicked(View view) {
        boolean isSelected = ((AppCompatRadioButton)view).isChecked();
        switch (view.getId()){
            case R.id.rbPin:
                if (isSelected){
                    rbPin.setTextColor(Color.WHITE);
                    rbState.setTextColor(Color.parseColor("#04C2EA"));
                    rbCity.setTextColor(Color.parseColor("#04C2EA"));
                }
                break;
            case R.id.rbState:
                if (isSelected){
                    rbState.setTextColor(Color.WHITE);
                    rbPin.setTextColor(Color.parseColor("#04C2EA"));
                    rbCity.setTextColor(Color.parseColor("#04C2EA"));
                }
                break;
            case R.id.rbCity:
                if (isSelected){
                    rbCity.setTextColor(Color.WHITE);
                    rbPin.setTextColor(Color.parseColor("#04C2EA"));
                    rbState.setTextColor(Color.parseColor("#04C2EA"));
                }
                break;
        }
    }
}