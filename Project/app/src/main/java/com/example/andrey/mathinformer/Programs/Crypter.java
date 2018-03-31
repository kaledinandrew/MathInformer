package com.example.andrey.mathinformer.Programs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.andrey.mathinformer.R;

public class Crypter extends AppCompatActivity {

    // Crypter
    private TextView text_crypting_result;
    private EditText input_text_crypter;
    private EditText input_key_crypter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crypter);

        // Crypter
        text_crypting_result = findViewById(R.id.text_crypting_result);
        Button button_encrypting = findViewById(R.id.button_encrypting);
        Button button_decrypting = findViewById(R.id.button_decrypting);
        input_text_crypter = findViewById(R.id.input_text_crypter);
        input_key_crypter = findViewById(R.id.input_key_crypter);

        text_crypting_result.setOnClickListener(onClickListener_crypter);
        button_encrypting.setOnClickListener(onClickListener_crypter);
        button_decrypting.setOnClickListener(onClickListener_crypter);

        Button button_crypter_exit = findViewById(R.id.button_crypter_exit);
        button_crypter_exit.setOnClickListener(onClickListener_crypter_exit);
    }

    private final View.OnClickListener onClickListener_crypter_exit = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
        }
    };

    // Crypter
    public int[] key_to_array(){
        String str_key = input_key_crypter.getText().toString();

        String[] str_array = str_key.split(":");
        int[] key_array;
        key_array = new int[str_array.length];

        for (int i = 0; i < str_array.length; i++){
            key_array[i] = Integer.parseInt(str_array[i]);
        }

        return key_array;
    }
    public String text_encrypting(String str, String str_key){
        String str_default = input_text_crypter.getText().toString();
        String[] str_key_array = str_key.split(":");
        String str_encrypted = "";
        Character ch_help = ' ';

        int[] key_array = key_to_array();
        for (int i = 0; i < key_array.length; i++){
            key_array[i] = Integer.parseInt(str_key_array[i]);
        }

        for (int i = 0; i < str.length(); i++){
            ch_help = (char)((int)(str.charAt(i)) + key_array[i % key_array.length]);
            str_encrypted = str_encrypted.concat(String.valueOf(ch_help));
        }

        return str_encrypted;
    }
    public String text_decrypting(String str, String str_key){
        String str_default = input_text_crypter.getText().toString();
        String[] str_key_array = str_key.split(":");
        String str_decrypted = "";
        Character ch_help = ' ';

        int[] key_array = key_to_array();
        for (int i = 0; i < key_array.length; i++){
            key_array[i] = Integer.parseInt(str_key_array[i]);
        }

        for (int i = 0; i < str.length(); i++){
            ch_help = (char)((int)(str.charAt(i)) - key_array[i % key_array.length]);
            str_decrypted = str_decrypted.concat(String.valueOf(ch_help));
        }

        return str_decrypted;
    }

    private final View.OnClickListener onClickListener_crypter = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String str_input = input_text_crypter.getText().toString();
            String key_input = input_key_crypter.getText().toString();
            if (!str_input.equals("") && !key_input.equals(""))
                switch (v.getId()){
                    case R.id.button_encrypting:
                        String str_print_encrypt = text_encrypting(str_input, key_input);
                        text_crypting_result.setText(str_print_encrypt);
                        break;
                    case R.id.button_decrypting:
                        String str_print_decrypt = text_decrypting(str_input, key_input);
                        text_crypting_result.setText(str_print_decrypt);
                        break;
                }
            else{
                Toast toast = Toast.makeText(getApplicationContext(), "Некоторые поля пусты", Toast.LENGTH_SHORT);
                toast.show();
            }
        }
    };
}
