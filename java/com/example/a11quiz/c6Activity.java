package com.example.a11quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class c6Activity extends AppCompatActivity {

    TextView textView;
    public void hide(View view){
        textView.setVisibility(View.INVISIBLE);
    }
    public void show(View view){
        textView.setVisibility(View.VISIBLE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c6);
        textView=(TextView)findViewById(R.id.textView2);
    }
}