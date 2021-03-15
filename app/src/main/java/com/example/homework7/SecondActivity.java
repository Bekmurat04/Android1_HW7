
package com.example.homework7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

            button2 = findViewById(R.id.btn_second);




          button2.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Intent intent1 = getIntent();
                  String text = intent1.getStringExtra("data");
                  Intent intent = new Intent(getApplicationContext(), ThirdActivity.class);
                  intent.putExtra("2", text);
                  startActivity(intent);
              }
          });

        }
    }
