package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.time.Duration;
import java.time.Instant;

public class MainActivity extends AppCompatActivity {
    private Button to2nd;
    static Instant during ;
    static Instant after;
    private final static String tag="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag, "OnCreate");

        to2nd = (Button) findViewById(R.id.button_to2ndfrom1);

        to2nd.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent();
                        intent.setClass(MainActivity.this, MainActivity2.class);
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