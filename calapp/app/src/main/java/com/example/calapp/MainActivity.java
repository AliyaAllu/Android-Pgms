package com.example.calapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onAdd(View v){
        EditText e1;
        EditText e2;
        e1 = (EditText) findViewById(R.id.et1);
        e2 = (EditText) findViewById(R.id.et2);
        Integer str1 = Integer.parseInt(e1.getText().toString());
        Integer str2 = Integer.parseInt(e2.getText().toString());
        Integer str_temp = str1+str2;
        e1.setText(str1);
        e2.setText(str2);
    }
    public void onSub(View v){
        EditText e1;
        EditText e2;
        EditText r;
        e1 = (EditText) findViewById(R.id.et1);
        e2 = (EditText) findViewById(R.id.et2);
        r = (EditText) findViewById(R.id.res) ;
        Integer str1 = Integer.parseInt(e1.getText().toString());
        Integer str2 = Integer.parseInt(e2.getText().toString());
        Integer str_temp = str1-str2;
        r.setText(str_temp);
    }
}