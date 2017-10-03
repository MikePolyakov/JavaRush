package level01.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
Добрая Зинаида и летние каникулы

Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» — «дата рождения».
Удалить из словаря всех людей, родившихся летом.

Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только три метода.
4. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Date состоящий из 10 записей.
5. Метод removeAllSummerPeople() должен удалять из словаря всех людей, родившихся летом.
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));

        //напишите тут ваш код
        map.put("Bush", new Date("MAY 4 1985"));
        map.put("Ivanov", new Date("JULY 25 1978"));
        map.put("Oland", new Date("NOVEMBER 12 1991"));
        map.put("Ford", new Date("MARCH 21 2003"));
        map.put("Washington", new Date("FEBRUARY 8 1982"));
        map.put("Jeferson", new Date("SEPTEMBER 17 1999"));
        map.put("Mugabe", new Date("APRIL 4 1982"));
        map.put("Adenauer", new Date("DECEMBER 29 2007"));
        map.put("Bismark", new Date("JUNE 3 1975"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код

        //        map.entrySet().removeIf(pair -> pair.getValue().getMonth() > 4 && pair.getValue().getMonth() < 8);
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        int month;
        Map.Entry<String, Date> pair;
        while (iterator.hasNext()) {
            pair = iterator.next();
            month = pair.getValue().getMonth();
            if (month > 4 && month < 8) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        removeAllSummerPeople(createMap());
        System.out.println(createMap());

    }
}
