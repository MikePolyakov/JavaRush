package level01.task01.task0140Scanner;

import java.util.Scanner;

/*
Выводим квадрат числа

Требования:
1. Программа должна выводить текст.
2. В программе необходимо создать объект типа Scanner.
3. Программа должна считывать данные с клавиатуры.
4. Программа должна выводить квадрат считанного числа.
*/

public class Solution {
    public static void main(String[] args) {
        int x;
        //напишите тут ваш код

        Scanner scn = new Scanner(System.in);
        x = scn.nextInt();
        System.out.println(x * x);

        int a, b, c;
        String s1, s2;
        System.out.println("Введите два числа");
        a = new Scanner(System.in).nextInt();
        b = new Scanner(System.in).nextInt();
        c = a + b;
        System.out.println("Сумма ваших чисел равна " + c);


    }
}
