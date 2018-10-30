package com.example.andrey.mathinformer;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.andrey.mathinformer.Tests.TestEasy;
import com.example.andrey.mathinformer.Tests.TestGod;
import com.example.andrey.mathinformer.Tests.TestHard;
import com.example.andrey.mathinformer.Tests.TestMiddle;

public class TestPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_page);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setTitle("Тесты по C#");
        }

        Button button_to_ege = findViewById(R.id.button_to_easy);
        button_to_ege.setOnClickListener(onClickListener_to_another_activity);

        Button button_to_theory = findViewById(R.id.button_to_middle);
        button_to_theory.setOnClickListener(onClickListener_to_another_activity);

        Button button_to_tests = findViewById(R.id.button_to_hard);
        button_to_tests.setOnClickListener(onClickListener_to_another_activity);

        Button button_to_programs = findViewById(R.id.button_to_god);
        button_to_programs.setOnClickListener(onClickListener_to_another_activity);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
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
                case R.id.button_to_god:
                    Intent intent_to_god = new Intent(TestPage.this, TestGod.class);
                    startActivity(intent_to_god);
                    break;
            }
        }
    };
}
