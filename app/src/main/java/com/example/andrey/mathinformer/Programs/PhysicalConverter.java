package com.example.andrey.mathinformer.Programs;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.andrey.mathinformer.R;

public class PhysicalConverter extends AppCompatActivity {

    RadioButton radio1, radio2, radio3, radio4, radio5;
    int operation = 0;
    TextView help, result;
    EditText input;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physical_converter);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setTitle("Полезные программы");
        }

        help = findViewById(R.id.phConverter_help);
        result = findViewById(R.id.phConverter_result);
        button = findViewById(R.id.phConverter_button);
        input = findViewById(R.id.phConverter_input);

        radio1 = findViewById(R.id.converter_1);
        radio2 = findViewById(R.id.converter_2);
        radio3 = findViewById(R.id.converter_3);
        radio4 = findViewById(R.id.converter_4);
        radio5 = findViewById(R.id.converter_5);
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

    public void radioButtonClickCheck(View view) {
        if (radio1.isChecked()) {
            help.setText("Перевод скорости из км/ч в м/с");
            operation = 1;
        }
        else if (radio2.isChecked()) {
            help.setText("Перевод скорости из м/с в км/ч");
            operation = 2;
        }
        else if (radio3.isChecked()) {
            help.setText("Перевод расстояния из миль в км");
            operation = 3;
        }
        else if (radio4.isChecked()) {
            help.setText("Перевод расстояния из км в мили");
            operation = 4;
        }
        else if (radio5.isChecked()) {
            help.setText("Перевод давления из мм ртутного столба в Па");
            operation = 5;
        }
    }

    public void showResult(View view) {
        if (input.getText().toString().equals(""))
            Toast.makeText(this, "Не введено число для перевода", Toast.LENGTH_SHORT).show();
        else{
            Double answer;
            switch (operation) {
                case 1:
                    answer = Double.parseDouble(input.getText().toString());
                    answer /= 3.6;
                    result.setText((input.getText().toString() + " км/ч = " + String.valueOf(String.format("%.2f", answer)) + " м/с"));
                    break;
                case 2:
                    answer = Double.parseDouble(input.getText().toString());
                    answer *= 3.6;
                    result.setText((input.getText().toString() + " м/с = " + String.valueOf(String.format("%.2f", answer)) + " км/ч"));
                    break;
                case 3:
                    answer = Double.parseDouble(input.getText().toString());
                    answer *= 1.60934;
                    result.setText((input.getText().toString() + " mi = " + String.valueOf(String.format("%.2f", answer)) + " км"));
                    break;
                case 4:
                    answer = Double.parseDouble(input.getText().toString());
                    answer /= 1.60934;
                    result.setText((input.getText().toString() + " км = " + String.valueOf(String.format("%.2f", answer)) + " mi"));
                    break;
                case 5:
                    answer = Double.parseDouble(input.getText().toString());
                    answer *= 133.322;
                    result.setText((input.getText().toString() + " мм рт. ст. = " + String.valueOf(String.format("%.2f", answer)) + " Па"));
                    break;
                default:
                    Toast.makeText(this, "Не выбраны физические величины для перевода", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    }
}
