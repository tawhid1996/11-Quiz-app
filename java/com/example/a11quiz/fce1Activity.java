package com.example.a11quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fce1Activity extends AppCompatActivity {
    private Button word1;
    private Button word2;
    private Button word3;
    private Button word4;
    private Button word5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fce1);


        word1 = findViewById(R.id.word1);

        word1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fce1Activity.this, w1Activity.class);
                startActivity(intent);
            }
        });
/*
        word2 = findViewById(R.id.word2);

        word2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fce1Activity.this, w2Activity.class);
                startActivity(intent);
            }
        });

        word3 = findViewById(R.id.word3);

        word3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fce1Activity.this, w3Activity.class);
                startActivity(intent);
            }
        });

        word4 = findViewById(R.id.word4);

        word4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fce1Activity.this, w4Activity.class);
                startActivity(intent);
            }
        });

        word5 = findViewById(R.id.word5);

        word5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fce1Activity.this, w5Activity.class);
                startActivity(intent);
            }
        });


       */




    }
}