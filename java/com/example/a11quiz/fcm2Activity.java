package com.example.a11quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fcm2Activity extends AppCompatActivity {
    private Button calculus6;
    private Button calculus7;
    private Button calculus8;
    private Button calculus9;
    private Button calculus10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fcm2);

        calculus6 = findViewById(R.id.calculus6);

        calculus6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fcm2Activity.this, c6Activity.class);
                startActivity(intent);
            }
        });

 /*

        calculus7 = findViewById(R.id.calculus7);

        calculus7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fcm2Activity.this, c7Activity.class);
                startActivity(intent);
            }
        });

        calculus8 = findViewById(R.id.calculus8);

        calculus8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fcm2Activity.this, c8Activity.class);
                startActivity(intent);
            }
        });

        calculus9 = findViewById(R.id.calculus9);

        calculus9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fcm2Activity.this, c9Activity.class);
                startActivity(intent);
            }
        });

        calculus10 = findViewById(R.id.calculus10);

        calculus10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fcm2Activity.this, c10Activity.class);
                startActivity(intent);
            }
        });

*/


    }
}

