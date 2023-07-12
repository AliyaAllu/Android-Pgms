package com.example.interestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3,e4;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.e1);
        e2 = (EditText) findViewById(R.id.e2);
        e3 = (EditText) findViewById(R.id.e3);
        e4 = (EditText) findViewById(R.id.e4);


     }
     public void oninterest(View v) {

         String loan = e1.getText().toString();
         String interest = e2.getText().toString();
         String year = e3.getText().toString();

         if (!loan.isEmpty() && !interest.isEmpty() && !year.isEmpty()) {
             float loans = Float.parseFloat(loan);
             float interests = Float.parseFloat(interest);
             int years = Integer.parseInt(year);// Convert height to meters
             float amount;
             if(years ==1)
             {
                  amount = (loans*interests)/years;
             }
             else if(years ==2)
             {
                  amount = (loans*interests)/years;
             }

         }

     }}