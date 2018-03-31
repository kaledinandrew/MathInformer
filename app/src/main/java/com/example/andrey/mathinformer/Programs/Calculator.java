package com.example.andrey.mathinformer.Programs;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.andrey.mathinformer.R;

public class Calculator extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    // Calculator
    private TextView text_calculating_result;
    private int operation;
    private EditText input1_calculator, input2_calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        text_calculating_result = findViewById(R.id.text_calculating_result);
        Button button_calculate = findViewById(R.id.button_calculation);
        input1_calculator = findViewById(R.id.input1_calculator);
        input2_calculator = findViewById(R.id.input2_calculator);
        RadioGroup rg_operations = findViewById(R.id.rg_operations);

        text_calculating_result.setOnClickListener(onClickListener_calculating);
        button_calculate.setOnClickListener(onClickListener_calculating);
        rg_operations.setOnCheckedChangeListener(this);

        Button button_calculator_exit = findViewById(R.id.button_calculator_exit);
        button_calculator_exit.setOnClickListener(onClickListener_calculator_exit);
    }


    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        RadioButton rg_operations = findViewById(i);

        if (rg_operations.getId() == R.id.addition) operation = 1;
        else if (rg_operations.getId() == R.id.subtraction) operation = 2;
        else if (rg_operations.getId() == R.id.multiplication) operation = 3;
        else if (rg_operations.getId() == R.id.dividing) operation = 4;
        else operation = 0;
    }

    private final View.OnClickListener onClickListener_calculator_exit = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
        }
    };

    private final View.OnClickListener onClickListener_calculating = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String a, b;
            a = input1_calculator.getText().toString();
            b = input2_calculator.getText().toString();

            if (!a.equals("") && !b.equals("")) {
                switch (operation) {
                    case 1:
                        Integer result = Integer.parseInt(a) + Integer.parseInt(b);
                        String str_result = result.toString();
                        text_calculating_result.setText(str_result);
                        break;
                    case 2:
                        result = Integer.parseInt(a) - Integer.parseInt(b);
                        str_result = result.toString();
                        text_calculating_result.setText(str_result);
                        break;
                    case 3:
                        result = Integer.parseInt(a) * Integer.parseInt(b);
                        str_result = result.toString();
                        text_calculating_result.setText(str_result);
                        break;
                    case 4:
                        if (Integer.parseInt(b) != 0) {
                            Double d_result;
                            d_result = Double.parseDouble(a) / Double.parseDouble(b);
                            str_result = d_result.toString();
                            text_calculating_result.setText(str_result);
                            break;
                        } else {
                            String error = "Деление на 0";
                            text_calculating_result.setText(error);
                            break;
                        }
                    default:
                        String error = "Ошибка";
                        text_calculating_result.setText(error);
                        break;
                }
            }
            else{
                Toast toast = Toast.makeText(getApplicationContext(), "Некоторые поля пусты", Toast.LENGTH_SHORT);
                toast.show();
            }
        }
    };
}
