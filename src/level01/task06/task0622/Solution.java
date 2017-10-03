package level01.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/*
Числа по возрастанию

Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = 5;
        ArrayList list = new ArrayList();


        for(int i = 0; i < N; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        Collections.sort(list);

        for(int i = 0; i < N; i++) {
            System.out.println(list.get(i));
        }
    }
}
