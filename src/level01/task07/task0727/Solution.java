package level01.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
Потом она конвертирует строки в верхний регистр (Мама превращается в МАМА) и выводит их на экран.

Меняем функциональность

Новая задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
Потом программа строит новый список. Если в строке чётное число букв, строка удваивается, если нечётное – утраивается.
Программа выводит содержимое нового списка на экран.

Требования:
1. Программа должна считывать данные с клавиатуры.
2. Программа должна вывести столько же строк, сколько было введено.
3. Если в строке было четное число букв, то необходимо удвоить строку (как в примере).
4. Если в строке было нечетное число букв, то необходимо утроить строку (как в примере).
5. Программа должна прекращать считывать данные с клавиатуры как только пользователь введет пустую строку и нажмет Enter.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        ArrayList<String> listUpperCase = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            listUpperCase.add(s.toUpperCase());
        }

        for (int i = 0; i < listUpperCase.size(); i++) {
            System.out.println(listUpperCase.get(i));
        }

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if(s.length()%2==0) {
                list.remove(i);
                list.add(i, s + " " + s);
            }
            else {
                list.remove(i);
                list.add(i, s + " " + s + " " + s);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}