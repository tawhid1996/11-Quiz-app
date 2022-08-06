package com.example.a11quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FlashcardActivity extends AppCompatActivity {
    private Button english;
    private Button mathematics;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flashcard);

        english = findViewById(R.id.english);

        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FlashcardActivity.this, Flashcard_englishActivity.class);
                startActivity(intent);

            }
        });

        mathematics = findViewById(R.id.mathematics);

        mathematics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FlashcardActivity.this, Flashcard_mathematicsActivity.class);
                startActivity(intent);

            }
        });






    }
}