package com.example.jbased;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bPress,bCancel;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);
        bPress = new Button(this);
        bPress.setText("press me!");
        bCancel = new Button(this);
        bCancel.setText("cancel !");
        LinearLayout lWindow = new LinearLayout(this);
        lWindow.setOrientation(LinearLayout.VERTICAL);
        lWindow.addView(bPress);
        lWindow.addView(bCancel);
        bPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "welcome to android programming", Toast.LENGTH_SHORT).show();
            }
        });
        bCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        setContentView(lWindow);
    }
}