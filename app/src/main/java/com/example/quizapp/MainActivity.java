package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button ba1,ba2,ba3,submitme,q1o2,q1o3,q1o4,q2o1,q2o2,q2o4,q3o1,q3o2,q3o4;
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
                ba1.setBackground(getResources().getDrawable(R.drawable.correct_option_border_bg));

            }
        });

        ba2= findViewById(R.id.q2o3);
        ba2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score++;
                ba2.setBackground(getResources().getDrawable(R.drawable.correct_option_border_bg));

            }
        });

        ba3= findViewById(R.id.q303);
        ba3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score++;

                ba3.setBackground(getResources().getDrawable(R.drawable.correct_option_border_bg));


            }
        });

        submitme=findViewById(R.id.submitme);
        submitme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                edt.setText("Score = " + score +"/" +"3");
                submitme.setVisibility(View.INVISIBLE);
                ba1.setBackground(getResources().getDrawable(R.drawable.correct_option_border_bg));
                q1o2.setBackground(getResources().getDrawable(R.drawable.wrong_option_border_bg));
                q1o3.setBackground(getResources().getDrawable(R.drawable.wrong_option_border_bg));
                q1o4.setBackground(getResources().getDrawable(R.drawable.wrong_option_border_bg));
                ba2.setBackground(getResources().getDrawable(R.drawable.correct_option_border_bg));
                q2o1.setBackground(getResources().getDrawable(R.drawable.default_option_border_bg));
                q2o2.setBackground(getResources().getDrawable(R.drawable.wrong_option_border_bg));
                q2o4.setBackground(getResources().getDrawable(R.drawable.wrong_option_border_bg));
                ba3.setBackground(getResources().getDrawable(R.drawable.correct_option_border_bg));
                q3o1.setBackground(getResources().getDrawable(R.drawable.wrong_option_border_bg));
                q3o2.setBackground(getResources().getDrawable(R.drawable.wrong_option_border_bg));
                q3o4.setBackground(getResources().getDrawable(R.drawable.wrong_option_border_bg));


            }
        });

        q1o2=findViewById(R.id.q1o2);
        q1o2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q1o2.setBackground(getResources().getDrawable(R.drawable.wrong_option_border_bg));
            }
        });

        q1o3=findViewById(R.id.q1o3);
        q1o3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q1o3.setBackground(getResources().getDrawable(R.drawable.wrong_option_border_bg));
            }
        });

        q1o4=findViewById(R.id.q1o4);
        q1o4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q1o4.setBackground(getResources().getDrawable(R.drawable.wrong_option_border_bg));
            }
        });

        q2o1=findViewById(R.id.q2o1);
        q2o1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q2o1.setBackground(getResources().getDrawable(R.drawable.default_option_border_bg));
            }
        });

        q2o2=findViewById(R.id.q2o2);
        q2o2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q2o2.setBackground(getResources().getDrawable(R.drawable.wrong_option_border_bg));
            }
        });

        q2o4=findViewById(R.id.q2o4);
        q2o4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q2o4.setBackground(getResources().getDrawable(R.drawable.wrong_option_border_bg));
            }
        });

        q3o1=findViewById(R.id.q3o1);
        q3o1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q3o1.setBackground(getResources().getDrawable(R.drawable.wrong_option_border_bg));
            }
        });

        q3o2=findViewById(R.id.q3o2);
        q3o2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q3o2.setBackground(getResources().getDrawable(R.drawable.wrong_option_border_bg));
            }
        });
        q3o4=findViewById(R.id.q3o4);
        q3o4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q3o4.setBackground(getResources().getDrawable(R.drawable.wrong_option_border_bg));
            }
        });
    }

}
