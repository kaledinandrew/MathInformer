package com.example.andrey.mathinformer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TheorySelector extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

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
}
