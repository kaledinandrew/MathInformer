package com.example.andrey.mathinformer;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class TheoryPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theory_page);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setTitle("Теория по C#");
        }

        String[] themes = new String[13]; // change number to enlarge list of themes
        themes = set_strings(themes);

        ListView listView = (ListView)findViewById(R.id.list_test);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, themes);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position, long id) {
                TextView textView = (TextView) itemClicked;
                String strText = textView.getText().toString(); // получаем текст нажатого элемента
                Intent intent_different_layouts = new Intent(TheoryPage.this, TheorySelector.class);

                if(strText.equalsIgnoreCase(getResources().getString(R.string.theory_1))) {
                    intent_different_layouts.putExtra("", 1);
                }
                else if(strText.equalsIgnoreCase(getResources().getString(R.string.theory_2))) {
                    intent_different_layouts.putExtra("", 2);
                }
                else if(strText.equalsIgnoreCase(getResources().getString(R.string.theory_3))) {
                    intent_different_layouts.putExtra("", 3);
                }
                else if(strText.equalsIgnoreCase(getResources().getString(R.string.theory_4))) {
                    intent_different_layouts.putExtra("", 4);
                }
                else if(strText.equalsIgnoreCase(getResources().getString(R.string.theory_5))) {
                    intent_different_layouts.putExtra("", 5);
                }
                else if(strText.equalsIgnoreCase(getResources().getString(R.string.theory_6))) {
                    intent_different_layouts.putExtra("", 6);
                }
                else if(strText.equalsIgnoreCase(getResources().getString(R.string.theory_7))) {
                    intent_different_layouts.putExtra("", 7);
                }
                else if(strText.equalsIgnoreCase(getResources().getString(R.string.theory_8))) {
                    intent_different_layouts.putExtra("", 8);
                }
                else if(strText.equalsIgnoreCase(getResources().getString(R.string.theory_9))) {
                    intent_different_layouts.putExtra("", 9);
                }
                else if(strText.equalsIgnoreCase(getResources().getString(R.string.theory_10))) {
                    intent_different_layouts.putExtra("", 10);
                }
                else if(strText.equalsIgnoreCase(getResources().getString(R.string.theory_11))) {
                    intent_different_layouts.putExtra("", 11);
                }
                else if(strText.equalsIgnoreCase(getResources().getString(R.string.theory_12))) {
                    intent_different_layouts.putExtra("", 12);
                }
                else if(strText.equalsIgnoreCase(getResources().getString(R.string.theory_13))) {
                    intent_different_layouts.putExtra("", 13);
                }


                startActivity(intent_different_layouts);
            }
        });
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

    private String[] set_strings(String[] themes){
        themes[0] = "Введение";
        themes[1] = "Типы данных";
        themes[2] = "Операторы присваивания";
        themes[3] = "Простейшая арифметика и строки";
        themes[4] = "Условные выражения и конструкции";
        themes[5] = "Цикл for";
        themes[6] = "Цикл с пред- и постусловием";
        themes[7] = "Массивы";
        themes[8] = "Сортировка массива";
        themes[9] = "Матрицы и массивы массивов";
        themes[10] = "Методы";
        themes[11] = "Перегрузка методов";
        themes[12] = "Рекурсия";


        return themes;
    }
}
