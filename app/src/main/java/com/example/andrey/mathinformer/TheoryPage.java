package com.example.andrey.mathinformer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TheoryPage extends AppCompatActivity {

    private String[] themes = new String[15];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theory_page);

        themes = set_strings(themes);

        ListView listView = (ListView)findViewById(R.id.list_test);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, themes);
        listView.setAdapter(arrayAdapter);
    }

    private String[] set_strings(String[] themes){
        themes[0] = "Введение";
        themes[1] = "Типы данных";
        themes[2] = "Операторы";
        themes[3] = "Строки. Легендарный \"Hello World!\"";
        themes[4] = "Простейшая арифметика";
        themes[5] = "Условные выражения и конструкции";
        themes[6] = "Цикл for";
        themes[7] = "Цикл с пред- и постусловием";
        themes[8] = "Массивы";
        themes[9] = "Сортировка массива";
        themes[10] = "Матрицы";
        themes[11] = "Массивы массивов";
        themes[12] = "Методы";
        themes[13] = "Перегрузка методов";
        themes[14] = "Рекурсия";

        return themes;
    }
}
