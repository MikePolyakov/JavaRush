package level01.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/*
Только для богачей

Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: «фамилия» — «зарплата».
Удалить из словаря всех людей, у которых зарплата ниже 500.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только три метода.
4. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Integer состоящих из 10 записей по принципу «фамилия» - «зарплата».
5. Метод removeItemFromMap() должен удалять из словаря всех людей, у которых зарплата ниже 500.
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Иванов", 100);
        map.put("Петров", 200);
        map.put("Сидоров", 300);
        map.put("Алахмед", 400);
        map.put("Трамп", 500);
        map.put("Ким", 600);
        map.put("Курва", 700);
        map.put("Бобруйско", 800);
        map.put("Жан-клод", 900);
        map.put("МакНил", 50);
        System.out.println(map);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        HashMap<String, Integer> copy = new HashMap<String, Integer>(map);
        for (Map.Entry<String, Integer> pair : copy.entrySet()){
            if (pair.getValue()<500)
                map.remove(pair.getKey());
        }
        System.out.println(map);
    }


    public static void main(String[] args) {
        removeItemFromMap(createMap());

    }
}