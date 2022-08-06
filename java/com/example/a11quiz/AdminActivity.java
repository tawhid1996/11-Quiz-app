package com.example.a11quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class AdminActivity extends AppCompatActivity {

    private Button logout;

    private EditText mQuest, mAns, mOp1, mOp2, mOp3, mOp4 ;
    private Button button;

    private FirebaseDatabase db = FirebaseDatabase.getInstance();
    private DatabaseReference root = db.getReference().child("Quiz");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        logout = findViewById(R.id.logout);

        mQuest = findViewById(R.id.quest);
        mAns = findViewById(R.id.ans);
        mOp1 = findViewById(R.id.opt1);
        mOp2 = findViewById(R.id.opt2);
        mOp3 = findViewById(R.id.opt3);
        mOp4 = findViewById(R.id.opt4);

        button = findViewById(R.id.button);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Toast.makeText(AdminActivity.this, "Logged Out!", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(AdminActivity.this,Login3Activity.class));
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String quest = mQuest.getText().toString();
                String ans = mAns.getText().toString();
                String opt1 = mOp1.getText().toString();
                String opt2 = mOp2.getText().toString();
                String opt3 = mOp3.getText().toString();
                String opt4 = mOp4.getText().toString();

                HashMap<String, String> userMap = new HashMap<>();

                userMap.put("Question", quest);
                userMap.put("Answare", ans);
                userMap.put("Option1", opt1);
                userMap.put("Option2", opt2);
                userMap.put("Option3", opt3);
                userMap.put("Option4", opt4);

                root.push().setValue(userMap);

            }
        });








    }
}