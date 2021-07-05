package com.example.autocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView e1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.autoCompleteTextView);
        String [] values={"c","cpp","java","python","jsp","parl"};
        ArrayAdapter<String> ad;
        ad=new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item);
        e1.setAdapter(ad);
        e1.setThreshold(1);
    }
}