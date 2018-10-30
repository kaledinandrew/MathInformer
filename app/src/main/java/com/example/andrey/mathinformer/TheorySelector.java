package com.example.andrey.mathinformer;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class TheorySelector extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setTitle("Теория по C#");
        }

        Bundle arguments = getIntent().getExtras();
        int number = Integer.valueOf(arguments.get("").toString());

        switch (number) {
            case 1:
                setContentView(R.layout.theory_layout_1);
                break;
            case 2:
                setContentView(R.layout.theory_layout_2);
                break;
            case 3:
                setContentView(R.layout.theory_layout_3);
                break;
            case 4:
                setContentView(R.layout.theory_layout_4);
                break;
            case 5:
                setContentView(R.layout.theory_layout_5);
                break;
            case 6:
                setContentView(R.layout.theory_layout_6);
                break;
            case 7:
                setContentView(R.layout.theory_layout_7);
                break;
            case 8:
                setContentView(R.layout.theory_layout_8);
                break;
            case 9:
                setContentView(R.layout.theory_layout_9);
                break;
            case 10:
                setContentView(R.layout.theory_layout_10);
                break;
            case 11:
                setContentView(R.layout.theory_layout_11);
                break;
            case 12:
                setContentView(R.layout.theory_layout_12);
                break;
            case 13:
                setContentView(R.layout.theory_layout_13);
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
