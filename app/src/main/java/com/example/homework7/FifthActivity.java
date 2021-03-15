package com.example.homework7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FifthActivity extends AppCompatActivity {
    Button button5;
    TextView editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

            button5 = findViewById(R.id.btn_fifth);
            editText = findViewById(R.id.tv_fifth);


           button5.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent intent = getIntent();
                   String text = intent.getStringExtra("4");
                   editText.setText(text);
                   button5.setText(text);
               }
           });


        }
    }
