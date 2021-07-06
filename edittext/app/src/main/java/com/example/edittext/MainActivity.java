package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tv;
    Button B1;
    EditText e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.txt_1);
        B1=findViewById(R.id.btn_1);
        e1=findViewById(R.id.edt_1);
        B1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String uname="";
        uname=e1.getText().toString();
        tv.setText("Hello" +uname);

    }
}