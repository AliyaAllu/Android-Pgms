package com.example.alertdemo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click(View v)
    {
        AlertDialog.Builder obj = new AlertDialog.Builder(this);
        obj.setMessage("Are you sure??");
        obj.setCancelable(true);

        obj.setPositiveButton(0,this);
        obj.setPositiveButton(1,this);
        AlertDialog d = obj.create();
        obj.show();
    }
}