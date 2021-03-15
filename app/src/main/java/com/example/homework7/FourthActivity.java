package com.example.homework7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FourthActivity extends AppCompatActivity {
    Button button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);


            button4 = findViewById(R.id.btn_fourth);


            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent2 = getIntent();
                    String text = intent2.getStringExtra("3");
                    Intent intent = new Intent(getApplicationContext(), FifthActivity.class);
                    intent.putExtra("4", text);
                    startActivity(intent);
                }
            });


        }
    }
