package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {
    private Button to2from3;
    private Button to1from3;
    private final static String tag="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_activity);

        to2from3 = (Button) findViewById(R.id.button_to2ndfrom3);
        to1from3 = (Button) findViewById(R.id.button_to1from3);

        to2from3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent();
                        intent.setClass(MainActivity3.this, MainActivity2.class);
                        startActivity(intent);
                    }
                }
        );
        to1from3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent();
                        intent.setClass(MainActivity3.this, MainActivity.class);
                        startActivity(intent);
                    }
                }
        );
    }
    public void onClick(View view){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);

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