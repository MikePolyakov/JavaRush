package level01.task10.task1011SubstringTrim;

/*
Большая зарплата

Вывести на экран надпись «Я не хочу изучать Java, я хочу большую зарплату» 40 раз по образцу.

Образец:
Я не хочу изучать Java, я хочу большую зарплату
не хочу изучать Java, я хочу большую зарплату
не хочу изучать Java, я хочу большую зарплату
е хочу изучать Java, я хочу большую зарплату
хочу изучать Java, я хочу большую зарплату
хочу изучать Java, я хочу большую зарплату
…


Требования:
1. Программа должна выводить текст на экран.
2. Программа должна выводить 40 строк.
3. В программе должен использоваться цикл for или while.
4. Выведенный текст должен соответствовать примеру из условия.
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";


        //напишите тут ваш код
        for (int i = 0; i < 40; i++) {
            System.out.println(s.substring(i));
        }

        for(int i=0;i<10;i++){
            System.out.println(s.substring(i).trim());
        }

        ArrayList<Character> list = new ArrayList<>();
        int N = s.length();
        for (int i = 0; i < N; i++) {
            list.add(s.charAt(i));
        }
        for (int j = 0; j < 10 ; j++) {
            for (int i = j; i < list.size(); i++) {
                System.out.print(list.get(i));
            }
            System.out.println();
        }


    }

}

