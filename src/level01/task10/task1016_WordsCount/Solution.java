package level01.task10.task1016_WordsCount;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
Одинаковые слова в списке

Ввести с клавиатуры в список 20 слов.
Нужно подсчитать количество одинаковых слов в списке.
Результат нужно представить в виде словаря Map<String, Integer>, где первый параметр – уникальная строка, а второй – число, сколько раз данная строка встречалась в списке.

Вывести содержимое словаря на экран.
В тестах регистр (большая/маленькая буква) влияет на результат.


Требования:
1. Метод countWords должен объявлять и инициализировать HashMap с типом элементов .
2. Метод countWords должен возвращать созданный словарь.
3. Метод countWords должен добавлять в словарь ключи, соответствующие уникальным строкам, и значения по этим ключам, отображающие сколько раз встречалась строка.
4. Программа должна выводить на экран полученный словарь.
5. Метод main должен вызывать метод countWords.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 6; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();

        //напишите тут ваш код

     /*   for (int i=0; i< list.size(); i++) {
            int count = 1;
            for (int j = i+1; j < list.size() ; j++) {
                if (list.get(i).equals(list.get(j))) {
                    count++;
                    list.remove(j);
                    j--;
                }
            }
            result.put(list.get(i), count);
        }
     */

 //       list.forEach(item -> result.put(item, (result.containsKey(item) ? result.get(item)+1: 1)));

        list.forEach(item  -> result.put(item , Collections.frequency(list, item )));

    return result;
    }
}


