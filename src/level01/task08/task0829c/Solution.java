package level01.task08.task0829c;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/*
Модернизация ПО

Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:

Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи


Требования:
1. Программа должна выводить текст на экран.
2. Программа должна считывать значения с клавиатуры.
3. Класс Solution должен содержать один метод.
4. Программа должна вывести фамилию семьи по введенному городу.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, String> citiesSecondName = new HashMap<>();
        while (true) {
            String family = reader.readLine();
            String city = reader.readLine();

            if (family.isEmpty() || city.isEmpty()) break;
            citiesSecondName.put(family, city);
        }

        String cityWhere = reader.readLine();

        for (HashMap.Entry<String, String> pair : citiesSecondName.entrySet()) {
            if (cityWhere.equals(pair.getValue())) {
                System.out.println(pair.getKey());
            }
        }
    }
}