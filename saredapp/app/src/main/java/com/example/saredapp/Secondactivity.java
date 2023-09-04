package com.example.saredapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Secondactivity extends AppCompatActivity {
    EditText e1,e2;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        e1=(EditText) findViewById(R.id.e1);
        e2=(EditText) findViewById(R.id.e2);
        sp= getSharedPreferences("SD", Context.MODE_PRIVATE);
        e1.setText(sp.getString("un","").toString());
        e2.setText(sp.getString("up","").toString());
    }
    public void onclose(View v)
    {
       SharedPreferences.Editor ed=sp.edit();
       ed.clear();
       ed.commit();
       finish();
    }
}