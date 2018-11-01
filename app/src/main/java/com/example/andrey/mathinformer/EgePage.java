package com.example.andrey.mathinformer;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class EgePage extends AppCompatActivity {

    private String[] themes = new String[27];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ege_page);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setTitle("Подготовка к ЕГЭ");
        }

        themes = setStrings(themes);

        ListView listView = (ListView)findViewById(R.id.list_test);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, themes);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position, long id) {
                TextView textView = (TextView) itemClicked;
                String strText = textView.getText().toString(); // получаем текст нажатого элемента
                Intent intent_different_layouts = new Intent(EgePage.this, EgeSelector.class);

                if(strText.equalsIgnoreCase(getResources().getString(R.string.ege_1))) {
                    intent_different_layouts.putExtra("", 1);
                }
                else if(strText.equalsIgnoreCase(getResources().getString(R.string.ege_2))) {
                    intent_different_layouts.putExtra("", 2);
                }
                else if(strText.equalsIgnoreCase(getResources().getString(R.string.ege_3))) {
                    intent_different_layouts.putExtra("", 3);
                }
                else if(strText.equalsIgnoreCase(getResources().getString(R.string.ege_4))) {
                    intent_different_layouts.putExtra("", 4);
                }
                else if(strText.equalsIgnoreCase(getResources().getString(R.string.ege_5))) {
                    intent_different_layouts.putExtra("", 5);
                }
                else if(strText.equalsIgnoreCase(getResources().getString(R.string.ege_6))) {
                    intent_different_layouts.putExtra("", 6);
                }
                else if(strText.equalsIgnoreCase(getResources().getString(R.string.ege_7))) {
                    intent_different_layouts.putExtra("", 7);
                }
                else if(strText.equalsIgnoreCase(getResources().getString(R.string.ege_8))) {
                    intent_different_layouts.putExtra("", 8);
                }
                else if(strText.equalsIgnoreCase(getResources().getString(R.string.ege_9))) {
                    intent_different_layouts.putExtra("", 9);
                }
                else if(strText.equalsIgnoreCase(getResources().getString(R.string.ege_10))) {
                    intent_different_layouts.putExtra("", 10);
                }
                else if(strText.equalsIgnoreCase(getResources().getString(R.string.ege_11))) {
                    intent_different_layouts.putExtra("", 11);
                }
                else if(strText.equalsIgnoreCase(getResources().getString(R.string.ege_12))) {
                    intent_different_layouts.putExtra("", 12);
                }
                else if(strText.equalsIgnoreCase(getResources().getString(R.string.ege_13))) {
                    intent_different_layouts.putExtra("", 13);
                }
                else if(strText.equalsIgnoreCase(getResources().getString(R.string.ege_14))) {
                    intent_different_layouts.putExtra("", 14);
                }
                else if(strText.equalsIgnoreCase(getResources().getString(R.string.ege_15))) {
                    intent_different_layouts.putExtra("", 15);
                }
                else if(strText.equalsIgnoreCase(getResources().getString(R.string.ege_16))) {
                    intent_different_layouts.putExtra("", 16);
                }
                else if(strText.equalsIgnoreCase(getResources().getString(R.string.ege_17))) {
                    intent_different_layouts.putExtra("", 17);
                }
                else if(strText.equalsIgnoreCase(getResources().getString(R.string.ege_18))) {
                    intent_different_layouts.putExtra("", 18);
                }
                else if(strText.equalsIgnoreCase(getResources().getString(R.string.ege_19))) {
                    intent_different_layouts.putExtra("", 19);
                }
                else if(strText.equalsIgnoreCase(getResources().getString(R.string.ege_20))) {
                    intent_different_layouts.putExtra("", 20);
                }
                else if(strText.equalsIgnoreCase(getResources().getString(R.string.ege_21))) {
                    intent_different_layouts.putExtra("", 21);
                }
                else if(strText.equalsIgnoreCase(getResources().getString(R.string.ege_22))) {
                    intent_different_layouts.putExtra("", 22);
                }
                else if(strText.equalsIgnoreCase(getResources().getString(R.string.ege_23))) {
                    intent_different_layouts.putExtra("", 23);
                }
                else if(strText.equalsIgnoreCase(getResources().getString(R.string.ege_24))) {
                    intent_different_layouts.putExtra("", 24);
                }
                else if(strText.equalsIgnoreCase(getResources().getString(R.string.ege_25))) {
                    intent_different_layouts.putExtra("", 25);
                }
                else if(strText.equalsIgnoreCase(getResources().getString(R.string.ege_26))) {
                    intent_different_layouts.putExtra("", 26);
                }
                else if(strText.equalsIgnoreCase(getResources().getString(R.string.ege_27))) {
                    intent_different_layouts.putExtra("", 27);
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

    private String[] setStrings(String[] themes){
        themes[0] = "1. Перевод систем счисления";
        themes[1] = "2. Таблицы истинности";
        themes[2] = "3. Анализ таблиц";
        themes[3] = "4. Базы данных";
        themes[4] = "5. Кодирование букв и слов";
        themes[5] = "6. Анализ/построение алгоритмов";
        themes[6] = "7. Диаграммы и Exсel";
        themes[7] = "8. Анализ кода";
        themes[8] = "9. Запись и передача файлов";
        themes[9] = "10. Комбинаторика/Перебор слов";
        themes[10] = "11. Рекурсия";
        themes[11] = "12. Структура сетей";
        themes[12] = "13. Количество информации";
        themes[13] = "14. Исполнитель Робот";
        themes[14] = "15. Пути в графе";
        themes[15] = "16. Системы счисления";
        themes[16] = "17. Множества";
        themes[17] = "18. Логические выражения";
        themes[18] = "19. Анализ кода, изменяющего массив";
        themes[19] = "20. Программы с циклами и условиями";
        themes[20] = "21. Анализ кода с подпрограммами";
        themes[21] = "22. ДП/Анализ кода";
        themes[22] = "23. Логические уравнения";
        themes[23] = "24(С1). Ошибки в коде";
        themes[24] = "25(С2). Обработка массива";
        themes[25] = "26(С3). Выигрышные стратегии";
        themes[26] = "27(С4). Программирование";
        return themes;
    }
}
