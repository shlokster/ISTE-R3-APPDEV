package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button ba1,ba2,ba3,submitme;
    private TextView edt;
    private int score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt=findViewById(R.id.textView);
        ba1= findViewById(R.id.q1o1);
        ba1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score++;
                Toast.makeText(MainActivity.this,"Correct Answer!", Toast.LENGTH_SHORT).show();
            }
        });

        ba2= findViewById(R.id.q2o3);
        ba2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score++;
                Toast.makeText(MainActivity.this,"Correct Answer!", Toast.LENGTH_SHORT).show();
            }
        });

        ba3= findViewById(R.id.q303);
        ba3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score++;
                Toast.makeText(MainActivity.this,"Correct Answer!", Toast.LENGTH_SHORT).show();
            }
        });

        submitme=findViewById(R.id.submitme);
        submitme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                edt.setText("Score = " + score +"/" +"3");
                submitme.setVisibility(View.INVISIBLE);
            }
        });
    }

}
