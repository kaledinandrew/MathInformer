package com.example.andrey.mathinformer.Programs;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.andrey.mathinformer.R;

import java.math.BigInteger;

public class ConverterNumeration extends AppCompatActivity {

    private EditText input_numeration_from, input_numeration_to, input_numeration_number;
    private TextView text_converting_result;

    Integer from = 0, to = 0;
    String number, result, from_string, to_string;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter_numeration);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setTitle("Полезные программы");
        }

        input_numeration_number = findViewById(R.id.input_numeration_number);
        input_numeration_from = findViewById(R.id.input_numeration_from);
        input_numeration_to = findViewById(R.id.input_numeration_to);
        text_converting_result = findViewById(R.id.text_numeration_result);
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

    public void convertNumber (View view) {
        from_string = input_numeration_from.getText().toString();
        to_string = input_numeration_to.getText().toString();
        number = input_numeration_number.getText().toString().toUpperCase();

        boolean empty_fields = from_string.equals("") || to_string.equals("") || number.equals("");

        if (empty_fields){
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Некоторые поля пусты", Toast.LENGTH_SHORT);
            toast.show();
        }
        else {
            boolean correct_numerations = checkNumerations(),
                    correct_number = checkNumber(),
                    number_conforms_numeration = checkConformance();

            if (correct_number && correct_numerations && number_conforms_numeration) {
                from = Integer.parseInt(from_string);
                to = Integer.parseInt(to_string);

                BigInteger a = new BigInteger(number, from);
                result = a.toString(to);
                text_converting_result.setText(result.toUpperCase());
            } else if (!correct_numerations) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Системы счисления указаны некорректно", Toast.LENGTH_SHORT);
                toast.show();
            } else if (!correct_number) {
                Toast toast = Toast.makeText(getApplicationContext(), "В записи числа могут " +
                        "присутствовать только цифры и символы латинского алфавита", Toast.LENGTH_LONG);
                toast.show();
            } else {
                Toast toast = Toast.makeText(getApplicationContext(), "Введенное число не " +
                        "соответствует начальной системе счисления", Toast.LENGTH_LONG);
                toast.show();
            }
        }
    }

    private boolean checkNumerations() {
        if (to_string.length() >= 3 || from_string.length() >= 3) return false;
        from = Integer.parseInt(from_string);
        to = Integer.parseInt(to_string);
        return !(from < 2 || from > 36 || to < 2 || to > 36);
    }
    private boolean checkNumber() {
        for (int i = 0; i < number.length(); i++){
            char ch = number.charAt(i);
            if (!(ch >= 'A' && ch <= 'Z') && !(ch >= '0' && ch <= '9')) return false;
        }
        return true;
    }
    private boolean checkConformance() {
        for (int i = 0; i < number.length(); i++){
            char ch = number.charAt(i);
            if (!(ch >= '0' && ch <= '9') && (ch - 'A' >= from - 10)) return false;
            if (Integer.parseInt(String.valueOf(ch)) >= from) return false;
        }
        return true;
    }
}
