package com.example.a11quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fcm1Activity extends AppCompatActivity {
    private Button calculus1;
    private Button calculus2;
    private Button calculus3;
    private Button calculus4;
    private Button calculus5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fcm1);


        calculus1 = findViewById(R.id.calculus1);

        calculus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fcm1Activity.this, c1Activity.class);
                startActivity(intent);
            }
        });
/*
        calculus2 = findViewById(R.id.calculus2);

        calculus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fcm1Activity.this, c2Activity.class);
                startActivity(intent);
            }
        });

        calculus3 = findViewById(R.id.calculus3);

        calculus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fcm1Activity.this, c3Activity.class);
                startActivity(intent);
            }
        });

        calculus4 = findViewById(R.id.calculus4);

        calculus4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fcm1Activity.this, c4Activity.class);
                startActivity(intent);
            }
        });

        calculus5 = findViewById(R.id.calculus5);

        calculus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fcm1Activity.this, c5Activity.class);
                startActivity(intent);
            }
        });


*/

    }
}