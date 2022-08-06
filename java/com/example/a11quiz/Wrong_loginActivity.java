package com.example.a11quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Wrong_loginActivity extends AppCompatActivity {
    private Button tryagain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wrong_login);


        tryagain = findViewById(R.id.tryagain);

        tryagain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Wrong_loginActivity.this, Login3Activity.class);
                startActivity(intent);
            }
        });
    }
}