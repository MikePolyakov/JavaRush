package level01.task08.task0812b;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/*
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        int[] list0 = {2, 4, 4, 4, 8, 8, 9, 4, 5, 5};

        for (int i = 0; i < 10; i++) {
            list.add(list0[i]);
        }
        for (int i = 0; i < 10; i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        Collections.sort(list);
        for (int i = 0; i < 10; i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        int max = 1;
        for (int i = 0; i < list.size(); i++)
        {
            int count = 1;
            for (int j = i + 1; j < list.size(); j++)
            {
                if (list.get(i) == list.get(j))
                {
                    count++;
                    if (count > max)
                    {
                        max = count;
                    }
                }
                else
                {
                    break;
                }
            }
        }
        System.out.println(max);
    }
}


