package com.example.json1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONObject;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {
    public static final String JSON_STRING="{\"employee\":{\"name\":\"sachin\",\"salary\":56000}}";
    TextView textView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1=(TextView) findViewById(R.id.textView2);
        try
        {
            JSONObject emp=(new JSONObject((JSON_STRING)).getJSONObject("employee"));
            String empname=emp.getString("name");
            int empsalary=emp.getInt("salary");
            String str="Employee Name:"+empname+"\n"+"Employee salary:"+empsalary;
            textView1.setText(str);
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}