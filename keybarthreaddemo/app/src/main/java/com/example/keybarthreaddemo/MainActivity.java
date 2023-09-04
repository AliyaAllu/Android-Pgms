package com.example.keybarthreaddemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Runnable {
    ProgressBar pb1,pb2;
    int pv=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pb1=(ProgressBar) findViewById(R.id.p1);
        pb2=(ProgressBar) findViewById(R.id.p2);
        pb1.setMax(100);
        pb2.setMax(100);
        pb1.setProgress(0);
        pb2.setProgress(0);
        pb2.setEnabled(false);

    }
    public void onb1(View v)
    {
        pv=pv+10;
        pb1.setProgress(pv);

    }
    public void onb2(View v)
    {
      pv=0;
      pb2.setEnabled(true);
      Thread t;
      t=new Thread(this);
      t.start();
    }
    public  void run()
    {
        try {
            {
                while(pv<=100)
                {
                    Thread.sleep(200);
                    pv+=10;
                    pb1.setProgress(pv);
                    pb2.setProgress(pv);
                }
                pb2.setEnabled(false);

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}