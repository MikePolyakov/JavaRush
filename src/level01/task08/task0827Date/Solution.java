package level01.task08.task0827Date;

import java.util.Date;

/*
Работа с датой

1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года — нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.

Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false


Требования:
1. Программа должна выводить текст на экран.
2. Класс Solution должен содержать два метода.
3. Метод isDateOdd() должен возвращать true, если количество дней с начала года - нечетное число, иначе false.
4. Метод main() должен вызывать метод isDateOdd().
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date zeroDate = new Date();
        Date inputDate = new Date(date);
        zeroDate.setDate(0);
        zeroDate.setMonth(0);
        zeroDate.setYear(inputDate.getYear());
        long delta = (inputDate.getTime() - zeroDate.getTime())/1000/3600/24;
//      return (delta % 2 == 0)? true : false;
        if (delta%2 != 0) return false;
        return true;



    }
}
