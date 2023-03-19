package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView Name,Address,Age,Gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Name= findViewById(R.id.name1);
        Address= findViewById(R.id.address1);
        Age= findViewById(R.id.age1);
        Gender= findViewById(R.id.gender1);

        String name= getIntent().getStringExtra("name");
        String address= getIntent().getStringExtra("address");
        String age= getIntent().getStringExtra("age");
        String gender= getIntent().getStringExtra("gender");


        Name.setText(name);
        Address.setText(address);
        Age.setText(age);
        Gender.setText(gender);
    }
}