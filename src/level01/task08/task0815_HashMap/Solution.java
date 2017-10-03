package level01.task08.task0815_HashMap;

import java.util.HashMap;


/*
Перепись населения

Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» — «Имя».
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только четыре метода.
4. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String,
   String состоящих из 10 записей по принципу «Фамилия» - «Имя».
5. Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
6. Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();

        map.put("Иванов","Иван");
        map.put("Петров","Иван");
        map.put("Сидоров","Иван");
        map.put("Алахмед","Петр");
        map.put("Трамп","Димон");
        map.put("Ким","Ин");
        map.put("Курва","Джанко");
        map.put("Бобруйско","Иван");
        map.put("Жан-клод","Петр");
        map.put("МакНил","Иван");
        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for (HashMap.Entry<String,String> pair : map.entrySet()){
            String value = pair.getValue();
            System.out.println(value);
            if (value.equals(name)) {count++;}
        }
        System.out.println(count);
        return count;
    }


    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        for (HashMap.Entry<String,String> pair : map.entrySet()){
            String value = pair.getKey();
            if (value.equals(lastName)) {count++;}
        }
        System.out.println(count);
        return count;

    }

    public static void main(String[] args) {

        System.out.println(createMap());
        getCountTheSameFirstName(createMap(), "Иван");
        getCountTheSameLastName(createMap(), "LastName6");


    }
}
