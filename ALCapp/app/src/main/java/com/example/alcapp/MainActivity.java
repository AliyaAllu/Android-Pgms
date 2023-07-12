package com.example.alcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("ALCapp","OnCreate()");

    }
    @Override
    public void onStart()
    {
        super.onStart();
        Log.d("ALCapp","onStart()");
    }
    @Override
    public void onStop()
    {
        super.onStop();
        Log.d("ALCapp", "onStop: ");
    }
    @Override
    public void onDestroy()
    {
        super.onDestroy();
        Log.d("ALCapp", "onDestroy: ");
    }
    @Override
    public void onResume()
    {
        super.onResume();
        Log.d("ALCapp","onResume:");
    }
    @Override
    public void onPause()
    {
        super.onPause();
        Log.d("ALCapp", "onPause: ");
    }
}