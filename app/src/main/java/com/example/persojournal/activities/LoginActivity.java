package com.example.persojournal.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.persojournal.R;

public class LoginActivity extends AppCompatActivity {
    private EditText emailEdit;
    private EditText passwordEdit;
    private Button signInButton;
    private Button createNewAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}