package com.example.andrey.mathinformer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.andrey.mathinformer.Programs.Calculator;
import com.example.andrey.mathinformer.Programs.ConverterNumeration;
import com.example.andrey.mathinformer.Programs.Crypter;
import com.example.andrey.mathinformer.Programs.RootSearch;

public class ProgramsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programs_page);

        // go to other activities
        Button button_go_to_calculator = findViewById(R.id.go_to_calculator);
        button_go_to_calculator.setOnClickListener(onClickListener_go_to_other_activity);

        Button button_go_to_crypter = findViewById(R.id.go_to_crypter);
        button_go_to_crypter.setOnClickListener(onClickListener_go_to_other_activity);

        Button button_do_to_converter_numeration = findViewById(R.id.go_to_converter_numeration);
        button_do_to_converter_numeration.setOnClickListener(onClickListener_go_to_other_activity);

        Button button_do_to_root_search = findViewById(R.id.go_to_root_search);
        button_do_to_root_search.setOnClickListener(onClickListener_go_to_other_activity);
    }

    private final View.OnClickListener onClickListener_go_to_other_activity = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.go_to_calculator:
                    Intent intent_calculator = new Intent(ProgramsPage.this, Calculator.class);
                    startActivity(intent_calculator);
                    break;
                case R.id.go_to_crypter:
                    Intent intent_crypter = new Intent(ProgramsPage.this, Crypter.class);
                    startActivity(intent_crypter);
                    break;
                case R.id.go_to_converter_numeration:
                    Intent intent_converter_numeration = new Intent(ProgramsPage.this, ConverterNumeration.class);
                    startActivity(intent_converter_numeration);
                    break;
                case R.id.go_to_root_search:
                    Intent intent_root_search = new Intent(ProgramsPage.this, RootSearch.class);
                    startActivity(intent_root_search);
                    break;
            }
        }
    };
}
