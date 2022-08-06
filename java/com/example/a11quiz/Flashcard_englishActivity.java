package com.example.a11quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Flashcard_englishActivity extends AppCompatActivity {
    private Button level_1_eng;
    private Button level_2_eng;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flashcard_english);

        level_1_eng = findViewById(R.id.level_1_eng);

        level_1_eng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Flashcard_englishActivity.this, fce1Activity.class);
                startActivity(intent);

            }
        });

        level_2_eng = findViewById(R.id.level_2_eng);

        level_2_eng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Flashcard_englishActivity.this, fce2Activity.class);
                startActivity(intent);

            }
        });

    }
}