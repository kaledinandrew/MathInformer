package com.example.andrey.mathinformer.Programs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.andrey.mathinformer.R;

public class PhysicalConverter extends AppCompatActivity {

    private int operation = 0;
    TextView help, result;
    EditText input;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physical_converter);

        help = findViewById(R.id.phConverter_help);
        result = findViewById(R.id.phConverter_result);
        button = findViewById(R.id.phConverter_button);
        input = findViewById(R.id.phConverter_input);
    }

    public void speed_to_seconds(MenuItem item){
        help.setText("Перевод скорости из км/ч в м/с");
        operation = 1;
    }
    public void speed_to_hours(MenuItem item){
        help.setText("Перевод скорости из м/с в км/ч");
        operation = 2;
    }
    public void length_to_km(MenuItem item){
        help.setText("Перевод расстояния из миль в км");
        operation = 3;
    }
    public void length_to_miles(MenuItem item){
        help.setText("Перевод расстояния из км в мили");
        operation = 4;
    }
    public void pressure_to_Pa(MenuItem item){
        help.setText("Перевод давления из мм ртутного столба в Па");
        operation = 5;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.physical_converter, menu);
        return true;
    }

    public void showResult(View view) {
        if (input.getText().toString() == "") Toast.makeText(this, "Не введено число для перевода", Toast.LENGTH_SHORT).show();
        else{
            Double answer;
            switch (operation) {
                case 1:
                    answer = Double.parseDouble(input.getText().toString());
                    answer /= 3.6;
                    result.setText((input.getText().toString() + " км/ч = " + String.valueOf(answer) + " м/с"));
                    break;
                case 2:
                    answer = Double.parseDouble(input.getText().toString());
                    answer /= 3.6;
                    result.setText((input.getText().toString() + " м/с = " + String.valueOf(answer) + " км/ч"));
                    break;
                case 3:
                    answer = Double.parseDouble(input.getText().toString());
                    answer *= 1.60934;
                    result.setText((input.getText().toString() + " mi = " + String.valueOf(answer) + " км"));
                    break;
                case 4:
                    answer = Double.parseDouble(input.getText().toString());
                    answer /= 1.60934;
                    result.setText((input.getText().toString() + " км = " + String.valueOf(answer) + " mi"));
                    break;
                case 5:
                    answer = Double.parseDouble(input.getText().toString());
                    answer *= 133.322;
                    result.setText((input.getText().toString() + " мм рт. ст. = " + String.valueOf(answer) + " Па"));
                    break;
                default:
                    Toast.makeText(this, "Не выбраны физические величины для перевода", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    }
}
