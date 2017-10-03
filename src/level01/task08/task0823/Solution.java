package level01.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Омовение Рамы

Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
мама мыла раму.

Пример вывода:
Мама Мыла Раму.


Требования:
1. Программа должна выводить текст на экран.
2. Программа должна считывать строку с клавиатуры.
3. Класс Solution должен содержать один метод.
4. Программа должна заменять в тексте первые буквы всех слов на заглавные.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //напишите тут ваш код
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i == 0 || chars[i-1] == ' '){
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }
        for (char x: chars) {
            System.out.print(x);
        }

        System.out.println();
        // second solution
        for (String slova : s.split(" ")) {
            String pervayaBukva = String.valueOf(slova.charAt(0));
            System.out.print(slova.replaceFirst(pervayaBukva, pervayaBukva.toUpperCase()) + " ");
        }

    }
}

