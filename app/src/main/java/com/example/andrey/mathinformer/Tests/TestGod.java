package com.example.andrey.mathinformer.Tests;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.andrey.mathinformer.R;


public class TestGod extends AppCompatActivity {

    RadioButton rb_q1, rb_q2, rb_q3, rb_q4, rb_q5, rb_q6, rb_q7, rb_q8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_god);

        rb_q1 = findViewById(R.id.god_rb1);
        rb_q2 = findViewById(R.id.god_rb2);
        rb_q3 = findViewById(R.id.god_rb3);
        rb_q4 = findViewById(R.id.god_rb4);
        rb_q5 = findViewById(R.id.god_rb5);
        rb_q6 = findViewById(R.id.god_rb6);
        rb_q7 = findViewById(R.id.god_rb7);
        rb_q8 = findViewById(R.id.god_rb8);
    }

    public void showResult(View view){
        int result = score();
        String message = "Результат: " + result + "/8\n";

        if (result > 5){
            Toast toast = Toast.makeText(getApplicationContext(),
                    message + "Поздравляю! Отличный результат!", Toast.LENGTH_LONG);
            toast.show();
        }
        else {
            Toast toast = Toast.makeText(getApplicationContext(),
                    message + "Попробуй снова, у тебя все получится!", Toast.LENGTH_LONG);
            toast.show();
        }
    }

    private int score(){
        int score = 0;

        if (rb_q1.isChecked()) score++;
        if (rb_q2.isChecked()) score++;
        if (rb_q3.isChecked()) score++;
        if (rb_q4.isChecked()) score++;
        if (rb_q5.isChecked()) score++;
        if (rb_q6.isChecked()) score++;
        if (rb_q7.isChecked()) score++;
        if (rb_q8.isChecked()) score++;

        return score;
    }

    public void WrongAnswers(View view){
        if (score() == 8) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Все ответы верны", Toast.LENGTH_LONG);
            toast.show();
        }
        else {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Неверные ответы:" + WrongNumbers(), Toast.LENGTH_LONG);
            toast.show();
        }
    }

    private String WrongNumbers(){
        String answers = "";
        if (!rb_q1.isChecked()) answers += " 1";
        if (!rb_q2.isChecked()) answers += " 2";
        if (!rb_q3.isChecked()) answers += " 3";
        if (!rb_q4.isChecked()) answers += " 4";
        if (!rb_q5.isChecked()) answers += " 5";
        if (!rb_q6.isChecked()) answers += " 6";
        if (!rb_q7.isChecked()) answers += " 7";
        if (!rb_q8.isChecked()) answers += " 8";

        return answers;
    }
}
