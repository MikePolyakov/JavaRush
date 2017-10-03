package level01.task08.task0829b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

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

        //list of addresses
        List cities = new ArrayList();
        List families= new ArrayList();
        while (true) {
            String city = reader.readLine();
            String family = reader.readLine();
            if (family.isEmpty()) break;
            cities.add(city);
            families.add(family);
        }

        //read city name
        String cityName = reader.readLine();

        for (int i = 0; i < cities.size(); i++){
            if (cityName.equals(cities.get(i)) && !(families.isEmpty())){
                System.out.println(families.get(i));
            }
        }
    }
}

