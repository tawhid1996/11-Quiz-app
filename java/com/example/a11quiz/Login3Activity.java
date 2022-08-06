package com.example.a11quiz;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login3Activity extends AppCompatActivity {
    private EditText email;
    private EditText password;
    private Button login;

    private FirebaseAuth auth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login3);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);

        auth = FirebaseAuth.getInstance();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt_email = email.getText().toString();
                String txt_password = password.getText().toString();
                loginUser(txt_email,txt_password);
            }
        });


    }

    private void loginUser(String email, String password) {

        auth.signInWithEmailAndPassword(email, password).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
            @Override
            public void onSuccess(AuthResult authResult) {
                Toast.makeText(Login3Activity.this, "Login Successfull!", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Login3Activity.this, NewQuizActivity.class));
                finish();
            }
        });


        auth.signInWithEmailAndPassword(email,password).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(Login3Activity.this, "Login failed!", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Login3Activity.this, Wrong_loginActivity.class));
                finish();
            }
        });

    }


}