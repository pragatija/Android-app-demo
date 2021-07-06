package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1;
    CheckBox c1,c2,c3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.btn_1);
        c1=findViewById(R.id.cb1);
        c2=findViewById(R.id.cb2);
        c3=findViewById(R.id.cb3);
        b1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String s1="";
        if (c1.isChecked()){
            s1="c";
        }
        if (c2.isChecked()){
            s1+=",cpp";

        }
        if (c3.isChecked()){
            s1+=",java";
        }
        Toast.makeText(this, ""+s1, Toast.LENGTH_LONG).show();
    }
}