package com.example.andrey.mathinformer.Programs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter_numeration);

        input_numeration_number = findViewById(R.id.input_numeration_number);
        input_numeration_from = findViewById(R.id.input_numeration_from);
        input_numeration_to = findViewById(R.id.input_numeration_to);
        text_converting_result = findViewById(R.id.text_numeration_result);
    }

    public void convertNumber (View view) {
        Integer from=0, to=0;
        String number, result, from_string, to_string;

        from_string = input_numeration_from.getText().toString();
        to_string = input_numeration_to.getText().toString();
        number = input_numeration_number.getText().toString();

        if (!from_string.equals("") && !to_string.equals("") && !number.equals("")) {
            from = Integer.parseInt(from_string);
            to = Integer.parseInt(to_string);

            BigInteger a = new BigInteger(number, from);
            result = a.toString(to);
            text_converting_result.setText(result);
        }
        else{
            Toast toast = Toast.makeText(getApplicationContext(), "Некоторые поля пусты", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
