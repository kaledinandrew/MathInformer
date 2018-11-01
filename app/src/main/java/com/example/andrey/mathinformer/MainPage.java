package com.example.andrey.mathinformer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        Button button_to_ege = findViewById(R.id.button_to_ege);
        button_to_ege.setOnClickListener(onClickListenerToAnotherActivity);

        Button button_to_theory = findViewById(R.id.button_to_theory);
        button_to_theory.setOnClickListener(onClickListenerToAnotherActivity);

        Button button_to_tests = findViewById(R.id.button_to_tests);
        button_to_tests.setOnClickListener(onClickListenerToAnotherActivity);

        Button button_to_programs = findViewById(R.id.button_to_programs);
        button_to_programs.setOnClickListener(onClickListenerToAnotherActivity);

        Button button_to_about = findViewById(R.id.button_to_about);
        button_to_about.setOnClickListener(onClickListenerToAnotherActivity);
    }

    private final View.OnClickListener onClickListenerToAnotherActivity = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.button_to_ege:
                    Intent intent_to_ege = new Intent(MainPage.this, EgePage.class);
                    startActivity(intent_to_ege);
                    break;
                case R.id.button_to_theory:
                    Intent intent_to_theory = new Intent(MainPage.this, TheoryPage.class);
                    startActivity(intent_to_theory);
                    break;
                case R.id.button_to_tests:
                    Intent intent_to_tests = new Intent(MainPage.this, TestPage.class);
                    startActivity(intent_to_tests);
                    break;
                case R.id.button_to_programs:
                    Intent intent_to_programs = new Intent(MainPage.this, ProgramsPage.class);
                    startActivity(intent_to_programs);
                    break;
                case R.id.button_to_about:
                    Intent intent_to_about = new Intent(MainPage.this, AboutPage.class);
                    startActivity(intent_to_about);
                    break;
            }
        }
    };
}
