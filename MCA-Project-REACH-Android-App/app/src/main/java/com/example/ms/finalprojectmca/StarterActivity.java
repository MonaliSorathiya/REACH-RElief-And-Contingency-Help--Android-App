package com.example.ms.finalprojectmca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ms.finalprojectmca.mona.MainActivity;

public class StarterActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starter);
        Button sqlite_app = findViewById(R.id.sqlite_app);
        sqlite_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StarterActivity.this, WelcomeActivity.class);
                startActivity(intent);
            }
        });
        Button mona = findViewById(R.id.mona);
        mona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StarterActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        Button locationvroadcast = findViewById(R.id.locationvroadcast);
        locationvroadcast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StarterActivity.this, MapsActivity.class);
                startActivity(intent);
            }
        });

    }
}
