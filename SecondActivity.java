package com.example.userdetailsapp;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    private TextView textViewDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textViewDetails = findViewById(R.id.textViewDetails);

        // Get the intent and extract the data
        String name = getIntent().getStringExtra("NAME");
        String age = getIntent().getStringExtra("AGE");
        String email = getIntent().getStringExtra("EMAIL");

        // Display the data
        String details = "Name: " + name + "\nAge: " + age + "\nEmail: " + email;
        textViewDetails.setText(details);
    }
}
