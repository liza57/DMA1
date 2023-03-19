package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
        Button btnmain;
        EditText name,address,age;
        RadioGroup gender;
        RadioButton male,female;
    String pergender="";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnmain=findViewById(R.id.submit);
        name=findViewById(R.id.name);
        address=findViewById(R.id.address);
        age=findViewById(R.id.age);
        gender=findViewById(R.id.gender);

        male=findViewById(R.id.male);
        female=findViewById(R.id.Female);


        btnmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(male.isChecked()){
                    pergender="Male";
                } else if (female.isChecked()) {
                    pergender="Female";
                }

                Intent intent= new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("name",name.getText().toString());
                intent.putExtra("address",address.getText().toString());
                intent.putExtra("age",age.getText().toString());
                intent.putExtra("gender",pergender);
                startActivity(intent);
            }
        });

    }
}