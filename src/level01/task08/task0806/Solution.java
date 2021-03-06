package level01.task08.task0806;

import java.util.HashMap;

/*
Коллекция HashMap из Object

Есть коллекция HashMap<String, Object>, туда занесли 10 различных пар объектов.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.

Пример вывода (тут показана только одна строка):
Sim - 5


Требования:
1. Программа должна создавать переменную коллекции HashMap с типом элементов String, Object. Переменная должна быть сразу проинициализирована.
2. Программа не должна считывать значения с клавиатуры.
3. Программа должна добавлять в коллекцию 10 различных объектов, согласно условию.
4. Программа должна выводить на экран список значений коллекции, каждый элемент с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("Sim", 5);
        map.put("Tom", 5.5);
        map.put("Arbus", false);
        map.put("Baby", null);
        map.put("Cat", "Cat");
        map.put("Eat", new Long(56));
        map.put("Food", new Character('3'));
        map.put("Gevey", '6');
        map.put("Hugs", 111111111111L);
        map.put("Comp", (double) 123);

        //напишите тут ваш код
        for (HashMap.Entry<String, Object> pair : map.entrySet()) {
            String key = pair.getKey();             // ключ
            Object value =  pair.getValue();        // значение
            System.out.println( key + " - " + value);
        }
        System.out.println();
        map.forEach((key, value) -> System.out.println(key+" - "+value));
    }
}
