package com.example.practice2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1,b2;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.btn_1);
        b2=findViewById(R.id.btn_2);
        tv=findViewById(R.id.txt_msg);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){

            case R.id.btn_1:
                tv.setText("First Button");
                break;
            case R.id.btn_2:
                tv.setText("Second Button");
                break;

        }

    }
}