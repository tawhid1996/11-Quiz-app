package com.example.a11quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Flashcard_mathematicsActivity extends AppCompatActivity {
    private Button level_1_mat;
    private Button level_2_mat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flashcard_mathematics);

        level_1_mat = findViewById(R.id.level_1_mat);

        level_1_mat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Flashcard_mathematicsActivity.this, fcm1Activity.class);
                startActivity(intent);

            }
        });

        level_2_mat = findViewById(R.id.level_2_mat);

        level_2_mat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Flashcard_mathematicsActivity.this, fcm2Activity.class);
                startActivity(intent);

            }
        });

    }
}