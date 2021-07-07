package com.example.rediobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1;
    RadioGroup rg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.btn_1);
        rg=findViewById(R.id.RadioGroup1);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String s1="";

        switch (rg.getCheckedRadioButtonId()){
            case R.id.radioButton3:
                s1 ="male";
                break;
            case R.id.radioButton4:
                s1 ="female";
                break;
        }
        Toast.makeText(this, ""+s1, Toast.LENGTH_SHORT).show();
    }
}