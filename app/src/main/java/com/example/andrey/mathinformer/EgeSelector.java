package com.example.andrey.mathinformer;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class EgeSelector extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setTitle("Подготовка к ЕГЭ");
        }

        Bundle arguments = getIntent().getExtras();
        int number = Integer.valueOf(arguments.get("").toString());

        switch (number) {
            case 1:
                setContentView(R.layout.ege_layout_1);
                break;
            case 2:
                setContentView(R.layout.ege_layout_2);
                break;
            case 3:
                setContentView(R.layout.ege_layout_3);
                break;
            case 4:
                setContentView(R.layout.ege_layout_4);
                break;
            case 5:
                setContentView(R.layout.ege_layout_5);
                break;
            case 6:
                setContentView(R.layout.ege_layout_6);
                break;
            case 7:
                setContentView(R.layout.ege_layout_7);
                break;
            case 8:
                setContentView(R.layout.ege_layout_8);
                break;
            case 9:
                setContentView(R.layout.ege_layout_9);
                break;
            case 10:
                setContentView(R.layout.ege_layout_10);
                break;
            case 11:
                setContentView(R.layout.ege_layout_11);
                break;
            case 12:
                setContentView(R.layout.ege_layout_12);
                break;
            case 13:
                setContentView(R.layout.ege_layout_13);
                break;
            case 14:
                setContentView(R.layout.ege_layout_14);
                break;
            case 15:
                setContentView(R.layout.ege_layout_15);
                break;
            case 16:
                setContentView(R.layout.ege_layout_16);
                break;
            case 17:
                setContentView(R.layout.ege_layout_17);
                break;
            case 18:
                setContentView(R.layout.ege_layout_18);
                break;
            case 19:
                setContentView(R.layout.ege_layout_19);
                break;
            case 20:
                setContentView(R.layout.ege_layout_20);
                break;
            case 21:
                setContentView(R.layout.ege_layout_21);
                break;
            case 22:
                setContentView(R.layout.ege_layout_22);
                break;
            case 23:
                setContentView(R.layout.ege_layout_23);
                break;
            case 24:
                setContentView(R.layout.ege_layout_24);
                break;
            case 25:
                setContentView(R.layout.ege_layout_25);
                break;
            case 26:
                setContentView(R.layout.ege_layout_26);
                break;
            case 27:
                setContentView(R.layout.ege_layout_27);
                break;
        }
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
}
