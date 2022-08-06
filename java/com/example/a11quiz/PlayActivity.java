package com.example.a11quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlayActivity extends AppCompatActivity {

    private Button pel1;
    private Button pel2;
    private Button pml1;
    private Button pml2;
    private Button sq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        pel1 = findViewById(R.id.pel1);

        pel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlayActivity.this, Pel1Activity.class);
                startActivity(intent);
            }
        });

        pel2 = findViewById(R.id.pel2);

        pel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlayActivity.this, Pel2Activity.class);
                startActivity(intent);
            }
        });

        pml1 = findViewById(R.id.pml1);

        pml1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlayActivity.this, Pml1Activity.class);
                startActivity(intent);
            }
        });

        pml2 = findViewById(R.id.pml2);

        pml2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlayActivity.this, Pml2Activity.class);
                startActivity(intent);
            }
        });






    }
}