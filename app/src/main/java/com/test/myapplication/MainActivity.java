package com.test.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button popmovButton;
    private Button stockhawkButton;
    private Button buildButton;
    private Button materialButton;
    private Button ubiquitousButton;
    private Button capstoneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        popmovButton     = (Button) findViewById(R.id.popmovButton);
        stockhawkButton  = (Button) findViewById(R.id.stockButton);
        buildButton      = (Button) findViewById(R.id.biggerButton);
        materialButton   = (Button)findViewById(R.id.materialButton);
        ubiquitousButton = (Button) findViewById(R.id.ubiquitousButton);
        capstoneButton   = (Button) findViewById(R.id.capstoneButton);


        popmovButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button will launch my popular movies app!", Toast.LENGTH_SHORT).show();
            }
        });


        stockhawkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button will launch my stock hawk app!", Toast.LENGTH_SHORT).show();
            }


        });

        buildButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button will launch my build it bigger app!", Toast.LENGTH_SHORT).show();
            }
        });

        materialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button will launch my make your app material app!", Toast.LENGTH_SHORT).show();
            }
        });

        ubiquitousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button will launch my go ubiquitous app!", Toast.LENGTH_SHORT).show();
            }
        });

        capstoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button will launch my capstone app!", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
