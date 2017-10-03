package level01.task08.task0814_Iterator;

import java.util.HashSet;
import java.util.Iterator;

/*
Больше 10? Вы нам не подходите

Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только три метода.
4. Метод createSet() должен создавать и возвращать множество HashSet состоящих из 20 различных чисел.
5. Метод removeAllNumbersMoreThan10() должен удалять из множества все числа больше 10.
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        //напишите тут ваш код
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            set.add(i*3);
        }
        return set;

    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        //напишите тут ваш код

        Iterator<Integer> iter = set.iterator();
        while (iter.hasNext()) {
            int x = iter.next();
            if (x > 10) {
                iter.remove();
            }
        }
        return set;
    }

    public static void main(String[] args) {
        System.out.println(createSet());
        System.out.println(removeAllNumbersMoreThan10(createSet()));

    }
}

