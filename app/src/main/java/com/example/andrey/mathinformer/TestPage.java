package com.example.andrey.mathinformer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.andrey.mathinformer.Tests.TestEasy;
import com.example.andrey.mathinformer.Tests.TestHard;
import com.example.andrey.mathinformer.Tests.TestMiddle;

public class TestPage extends AppCompatActivity {

    private String[] themes = new String[15];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_page);

        Button button_to_ege = findViewById(R.id.button_to_easy);
        button_to_ege.setOnClickListener(onClickListener_to_another_activity);

        Button button_to_theory = findViewById(R.id.button_to_middle);
        button_to_theory.setOnClickListener(onClickListener_to_another_activity);

        Button button_to_tests = findViewById(R.id.button_to_hard);
        button_to_tests.setOnClickListener(onClickListener_to_another_activity);

        Button button_to_programs = findViewById(R.id.button_to_god);
        button_to_programs.setOnClickListener(onClickListener_to_another_activity);
    }

    private final View.OnClickListener onClickListener_to_another_activity = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.button_to_easy:
                    Intent intent_to_easy = new Intent(TestPage.this, TestEasy.class);
                    startActivity(intent_to_easy);
                    break;
                case R.id.button_to_middle:
                    Intent intent_to_middle = new Intent(TestPage.this, TestMiddle.class);
                    startActivity(intent_to_middle);
                    break;

                case R.id.button_to_hard:
                    Intent intent_to_hard = new Intent(TestPage.this, TestHard.class);
                    startActivity(intent_to_hard);
                    break;
                /*
                case R.id.button_to_god:
                    Intent intent_to_god = new Intent(TestPage.this, ProgramsPage.class);
                    startActivity(intent_to_god);
                    break;
                */
            }
        }
    };

    private String[] set_strings(String[] themes){
        themes[0] = "Введение";
        themes[1] = "Типы данных";
        themes[2] = "Операторы";
        themes[3] = "Строки. Легендарный \"Hello World!\"";
        themes[4] = "Простейшая арифметика";
        themes[5] = "Условные выражения и конструкции";
        themes[6] = "Цикл for";
        themes[7] = "Цикл с пред- и постусловием";
        themes[8] = "Массивы";
        themes[9] = "Сортировка массива";
        themes[10] = "Матрицы";
        themes[11] = "Массивы массивов";
        themes[12] = "Методы";
        themes[13] = "Перегрузка методов";
        themes[14] = "Рекурсия";

        return themes;
    }
}
