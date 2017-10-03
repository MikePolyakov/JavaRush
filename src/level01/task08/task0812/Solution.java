package level01.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/*
Cамая длинная последовательность

1. Создай список чисел.
2. Добавь в список 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.

Пример для списка 2, 4, 4, 4, 8, 8, 9, 12, 12, 14:
3

Искомое значение равно 3, т.к. самая длинная последовательность повторяющихся чисел состоит из трех четверок.


Требования:
1. Программа должна выводить число на экран.
2. Программа должна считывать значения с клавиатуры.
3. В методе main объяви переменную типа ArrayList с типом элементов Integer и сразу проинициализируй ee.
4. Программа должна добавлять в коллекцию 10 чисел, согласно условию.
5. Программа должна выводить на экран длину самой длинной последовательности
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = 10;
        for(int i = 0; i < N; i++){
            list.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = 0; i < N; i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        Collections.sort(list);
        for (int i = 0; i < N; i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        int max = 1;
        for (int i = 0; i < list.size(); i++) {
            int count = 1;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    count++;
                    if (count > max) {
                        max = count;
                    }
                } else {
                    break;
                }
            }
        }
        System.out.println(max);
    }
}
