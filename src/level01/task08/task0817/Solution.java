package level01.task08.task0817;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;

/*
Нам повторы не нужны

Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» — «имя».
Удалить людей, имеющих одинаковые имена.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только четыре метода.
4. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, String состоящих из 10 записей.
5. Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
6. Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap();//создаем массив и забиваем данными
        map.put("Иванов", "Иван");
        map.put("Петров", "Иван");
        map.put("Сидоров", "Иван");
        map.put("Алахмед", "Петр");
        map.put("Трамп", "Димон");
        map.put("Ким", "Ин");
        map.put("Курва", "Джанко");
        map.put("Бобруйско", "Иван");
        map.put("Жан-клод", "Петр");
        map.put("МакНил", "Иван");
        System.out.println(map);
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {//с параметром map
        ArrayList<String> list = new ArrayList();// создаю дополнительный список

        for (HashMap.Entry<String, String> xName : map.entrySet()) {//перебирает все значения в массиве
            list.add(xName.getValue());//по очередно добавляет значения (Value это FirsstName) в список list
        }
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (String xxName : list) {//перебирает список list
            if (Collections.frequency(list, xxName) > 1) {//если в списке значение повторяется, то
                removeItemFromMapByValue(map, xxName);//запускает данный метод, передавая в него массив и
                //значение Value которое повторяется
            }
        }
        System.out.println(map);
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);//массив копируется, так
        //как в текущем массиве нельзя удалять - нарушается его целстность и цикл не правильно работает
        for (Map.Entry<String, String> pair : copy.entrySet()) {//перебирает все значения в массиве
            if (pair.getValue().equals(value))//если значение Value в массиве copy равно переданному
                //значению в начале метода
                map.remove(pair.getKey());//то удаляет запись в другом массиве map по ключу,
            //так как ключ уникален в данном массиве (ключом выступает LastName)
        }
    }

    public static void main(String[] args) {
        removeTheFirstNameDuplicates(createMap());
    }
}