package com.example.pomogite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Hello extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
    }
    public void onClick(View view){
        Intent intent = new Intent(view.getContext(), HomeActivity.class);
        startActivity(intent);
    }
}