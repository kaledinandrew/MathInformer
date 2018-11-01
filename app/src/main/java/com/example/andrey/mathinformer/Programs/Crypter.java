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

public class Crypter extends AppCompatActivity {

    // Crypter
    private TextView text_crypting_result;
    private EditText input_text_crypter;
    private EditText input_key_crypter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crypter);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setTitle("Полезные программы");
        }

        // Crypter
        text_crypting_result = findViewById(R.id.text_crypting_result);
        Button button_encrypting = findViewById(R.id.button_encrypting);
        Button button_decrypting = findViewById(R.id.button_decrypting);
        input_text_crypter = findViewById(R.id.input_text_crypter);
        input_key_crypter = findViewById(R.id.input_key_crypter);

        text_crypting_result.setOnClickListener(onClickListenerCrypter);
        button_encrypting.setOnClickListener(onClickListenerCrypter);
        button_decrypting.setOnClickListener(onClickListenerCrypter);

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

    // Crypter
    public int[] keyToArray(){
        String str_key = input_key_crypter.getText().toString();

        String[] str_array = str_key.split(":");
        int[] key_array;
        key_array = new int[str_array.length];

        for (int i = 0; i < str_array.length; i++){
            key_array[i] = Integer.parseInt(str_array[i]);
        }

        return key_array;
    }
    public String textEncrypting(String str, String str_key){
        String str_default = input_text_crypter.getText().toString();
        String[] str_key_array = str_key.split(":");
        String str_encrypted = "";
        Character ch_help;

        int[] key_array = keyToArray();
        for (int i = 0; i < key_array.length; i++){
            key_array[i] = Integer.parseInt(str_key_array[i]);
        }

        for (int i = 0; i < str.length(); i++){
            ch_help = (char)((int)(str.charAt(i)) + key_array[i % key_array.length]);
            str_encrypted = str_encrypted.concat(String.valueOf(ch_help));
        }

        return str_encrypted;
    }
    public String textDecrypting(String str, String str_key){
        String str_default = input_text_crypter.getText().toString();
        String[] str_key_array = str_key.split(":");
        String str_decrypted = "";
        Character ch_help = ' ';

        int[] key_array = keyToArray();
        for (int i = 0; i < key_array.length; i++){
            key_array[i] = Integer.parseInt(str_key_array[i]);
        }

        for (int i = 0; i < str.length(); i++){
            ch_help = (char)((int)(str.charAt(i)) - key_array[i % key_array.length]);
            str_decrypted = str_decrypted.concat(String.valueOf(ch_help));
        }

        return str_decrypted;
    }

    private final View.OnClickListener onClickListenerCrypter = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String str_input = input_text_crypter.getText().toString();
            String key_input = input_key_crypter.getText().toString();

            boolean empty_fields, wrong_key_numbers = false;
            empty_fields = (!str_input.equals("") && !key_input.equals("")) ?  Boolean.FALSE : Boolean.TRUE;

            String[] key_values = key_input.split(":");
            for (String s : key_values){
                if (s.length() > 8 || s.length() < 1) { wrong_key_numbers = true; break; }
            }

            if (!empty_fields && !wrong_key_numbers)
                switch (v.getId()){
                    case R.id.button_encrypting:
                        String str_print_encrypt = textEncrypting(str_input, key_input);
                        text_crypting_result.setText(str_print_encrypt);
                        break;
                    case R.id.button_decrypting:
                        String str_print_decrypt = textDecrypting(str_input, key_input);
                        text_crypting_result.setText(str_print_decrypt);
                        break;
                }
            else if (wrong_key_numbers) {
                Toast toast = Toast.makeText(getApplicationContext(), "Каждое значение в ключе должно быть больше 0 и меньше 10^8", Toast.LENGTH_LONG);
                toast.show();
            }
            else {
                Toast toast = Toast.makeText(getApplicationContext(), "Некоторые поля пусты", Toast.LENGTH_SHORT);
                toast.show();
            }
        }
    };
}
