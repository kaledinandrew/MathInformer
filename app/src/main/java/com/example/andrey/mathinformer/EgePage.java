package com.example.andrey.mathinformer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class EgePage extends AppCompatActivity {

    private String[] themes = new String[27];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ege_page);

        themes = set_strings(themes);

        ListView listView = (ListView)findViewById(R.id.list_test);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, themes);
        listView.setAdapter(arrayAdapter);
    }

    private String[] set_strings(String[] themes){
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
