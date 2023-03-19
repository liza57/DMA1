package com.example.lifecycle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView name,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Lifecycle","onstart method called");
        Toast.makeText(this,"onstart method called",Toast.LENGTH_LONG).show();
        name=findViewById(R.id.name);
        if(savedInstanceState != null){
            String username=savedInstanceState.getString("name");
            name.setText(username);
        }

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Lifecycle","onStart method called");
        Toast.makeText(this,"onStart method called",Toast.LENGTH_LONG).show();

    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Lifecycle","onResume method called");
        Toast.makeText(this,"onResume method called",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Lifecycle","onStop method called");
        Toast.makeText(this,"onStop method called",Toast.LENGTH_LONG).show();

    }

    protected void onDestroy() {
        super.onDestroy();
        Log.d("Lifecycle","onDestroy method called");
        Toast.makeText(this,"onDestroy method called",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("Lifecycle","Save instance state called");
        outState.putString("name",name.getText().toString());
    }
}