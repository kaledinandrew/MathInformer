package com.example.andrey.mathinformer.Programs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.andrey.mathinformer.R;

public class RootSearch extends AppCompatActivity {

    private EditText input_A, input_B, input_C;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_root_search);

        input_A = findViewById(R.id.input_root_search_A);
        input_B = findViewById(R.id.input_root_search_B);
        input_C = findViewById(R.id.input_root_search_C);
        result = findViewById(R.id.text_root_search_result);
    }

    public final void find_root(View view){
        Double A=0.0, B=0.0, C=0.0, D;
        String str_result, A_string, B_string, C_string;
        A_string = input_A.getText().toString().replace(',', '.');
        B_string = input_B.getText().toString().replace(',', '.');
        C_string = input_C.getText().toString().replace(',', '.');

        if (!A_string.equals("") && !B_string.equals("") && !C_string.equals("")) {
            A = Double.valueOf(A_string);
            B = Double.valueOf(B_string);
            C = Double.valueOf(C_string);

            if (A != 0) {
                D = Math.pow(B, 2) - 4 * A * C;
                if (D > 0) {
                    Double  x1 = ((-1) * B - Math.pow(D, 0.5)) / (2 * A),
                            x2 = ((-1) * B + Math.pow(D, 0.5)) / (2 * A);
                    str_result = "D > 0 \n" + "D = " + String.valueOf(String.format("%.2f", D)) + "\n";
                    str_result += "x1 = " + String.valueOf(String.format("%.2f", x1)) + "\nx2 = " + String.valueOf(String.format("%.2f", x2));
                }
                else if (D == 0) {
                    Double x = (-1) * B / (2 * A);
                    str_result = "D = 0 \n";
                    str_result += "x1, x2 = " + String.valueOf(String.format("%.2f", x));
                }
                else {
                    str_result = "D < 0 \nНет корней";
                }
            }
            else {
                Double x = (-1) * C / B;
                str_result = "x = " + String.valueOf(String.format("%.2f", x));
            }

            result.setText(str_result);
        }
        else{
            Toast toast = Toast.makeText(getApplicationContext(), "Некоторые поля пусты", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
