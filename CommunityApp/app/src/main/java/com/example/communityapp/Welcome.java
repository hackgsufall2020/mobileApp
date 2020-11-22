package com.example.communityapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Welcome extends AppCompatActivity {
    Button button1;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        // Create a button that navigate the user to the next page
        button1 = findViewById(R.id.SignUp);
        button2 = findViewById(R.id.SignIN);

        //Listener for the button1
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(Welcome.this, SignUp.class));
            }
        });

    }
}
