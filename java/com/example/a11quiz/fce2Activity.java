package com.example.a11quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fce2Activity extends AppCompatActivity {
    private Button word6;
    private Button word7;
    private Button word8;
    private Button word9;
    private Button word10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fce2);





        word6 = findViewById(R.id.word6);

        word6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fce2Activity.this, w6Activity.class);
                startActivity(intent);
            }
        });
/*
        word7 = findViewById(R.id.word7);

        word7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fce2Activity.this, w7Activity.class);
                startActivity(intent);
            }
        });

        word8 = findViewById(R.id.word8);

        word8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fce2Activity.this, w8Activity.class);
                startActivity(intent);
            }
        });

        word9 = findViewById(R.id.word9);

        word9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fce2Activity.this, w9Activity.class);
                startActivity(intent);
            }
        });

        word10 = findViewById(R.id.word10);

        word10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fce2Activity.this, w10Activity.class);
                startActivity(intent);
            }
        });


       */









    }
}