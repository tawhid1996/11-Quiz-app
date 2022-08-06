package com.example.a11quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SettinghsActivity extends AppCompatActivity {
    private Button name;
    private Button privacy_and_policy;
    private Button term_and_condition;
    private Button help;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settinghs);

        name = findViewById(R.id.name);
        name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SettinghsActivity.this,NameActivity.class);
                startActivity(intent);
            }
        });

        privacy_and_policy = findViewById(R.id.privacy_and_policy);
        privacy_and_policy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SettinghsActivity.this,Privacy_and_policyActivity.class);
                startActivity(intent);
            }
        });

        term_and_condition= findViewById(R.id.term_and_condition);
        term_and_condition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SettinghsActivity.this,Term_and_conditionActivity.class);
                startActivity(intent);
            }
        });

        help = findViewById(R.id.help);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SettinghsActivity.this,HelpActivity.class);
                startActivity(intent);
            }
        });

    }
}