package level01.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/*
В убывающем порядке

Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.


Требования:
1. Программа должна считывать 20 целых чисел с клавиатуры.
2. Программа должна выводить 20 чисел.
3. Метод main должен вызывать метод sort.
4. Метод sort должен сортировать переданный массив по убыванию.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = 5;

        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort2(array); // ниже 2 метода - sort1 sort2

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort1(int[] array) {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<>();

        int N = array.length;

        for (int i = 0; i < N; i++){
            list.add(array[i]);
        }

        Collections.sort(list);


        for(int i = 0; i < list.size(); i++) {
            array[i] = list.get(list.size()-i-1);
        }
    }
    public static void sort2(int[] array) {
        int t;

        int N = array.length;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (array[j] > array[i]) {
                    t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                    for (int k = 0; k < N; k++){
                        System.out.print(array[k] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}