package level01.task09.task0926ArrayList;

import java.util.ArrayList;

/*
Список из массивов чисел

Создать список, элементами которого будут массивы чисел.
Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно.
Заполнить массивы любыми данными и вывести их на экран.


Требования:
1. Метод createList должен объявлять и инициализировать переменную типа ArrayList.
2. Метод createList должен возвращать созданный список.
3. Метод createList должен добавлять в список 5 элементов.
4. Каждый элемент в списке должен быть массивом чисел. Длина первого должна быть 5 элементов, второго - 2, следующих - 4, 7, 0 соответственно.
5. Программа должна выводить на экран элементы всех массивов из списка. Каждый элемент с новой строки.
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()  {
        //напишите тут ваш код
        /*
            ArrayList<int[]> list = new ArrayList<>();
            for (int i : new int[]{5, 2, 4, 7, 0}) list.add(new int[i]);
            for (int[] i : list)
                for (int j = 0; j < i.length; j ++)
                    i[j] = j * j;
            return list;
        */

            ArrayList arrayList = new ArrayList<>();
            arrayList.add(new int[]{1,2,3,4,5});
            arrayList.add(new int[]{6,7});
            arrayList.add(new int[]{8,9,10,11});
            arrayList.add(new int[]{12,13,14,15,16,17,18});
            arrayList.add(new int[]{});
            return arrayList;

    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}

