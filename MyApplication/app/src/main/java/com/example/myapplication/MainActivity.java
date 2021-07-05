package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
   TextView tv1,tv2,tv3;
    Button b4,b5,b6,b7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=findViewById(R.id.enter_1);
        tv2=findViewById(R.id.Number2);
        tv3=findViewById(R.id.result);
        b4=findViewById(R.id.btn_4);
        b5=findViewById(R.id.btn_5);
        b6=findViewById(R.id.btn_6);
        b7=findViewById(R.id.btn_7);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
       String s1=tv1.getText().toString();
       String s2=tv2.getText().toString();
       int a=Integer.parseInt(s1);
       int b=Integer.parseInt(s2);
      int c;
      switch (v.getId()){
          case R.id.btn_4:
             c=a+b;
             tv3.setText(""+c);
              break;
          case R.id.btn_5:
              c=a-b;
              tv3.setText(""+c);
              break;
          case R.id.btn_6:
              c=a*b;
              tv3.setText(""+c);
              break;
          case R.id.btn_7:
              c=a/b;
              tv3.setText(""+c);
              break;
          default:
              tv3.setText("clear");
      }




    }
}