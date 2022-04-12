package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    private final static String tag="MainActivity";
    private Button to1from2;
    private Button to3from2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        to1from2 = (Button) findViewById(R.id.to1from2);
        to3from2 = (Button) findViewById(R.id.to3from2);
        to1from2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent();
                        intent.setClass(MainActivity2.this, MainActivity.class);
                        startActivity(intent);
                    }
                }
        );
        to3from2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent();
                        intent.setClass(MainActivity2.this, MainActivity3.class);
                        startActivity(intent);
                    }
                }
        );

    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(tag, "onDestroy");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d(tag, "onStop");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d(tag, "onStart");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d(tag, "onPause");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d(tag, "onResume");
    }
}