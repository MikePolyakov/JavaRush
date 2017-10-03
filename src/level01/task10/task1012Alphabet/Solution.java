package level01.task10.task1012Alphabet;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


/*
Количество букв

Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита). Результат вывести на экран в алфавитном порядке.

Пример вывода:
а 5
б 8
в 3
г 7
д 0
…
я 9


Требования:
1. Программа должна считывать данные с клавиатуры.
2. Программа должна выводить текст на экран.
3. Выведенный текст должен содержать 33 строки.
4. Каждая строка вывода должна содержать букву русского алфавита, пробел и сколько раз буква встречалась в введенных строках.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();


        ArrayList<Character> alphabet = new ArrayList<>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        // напишите тут ваш код
        ArrayList<Character> xArray = new ArrayList<>();
            for (String x: list) {
                char[] ss = x.toCharArray();
                for (char n: ss) {
                    xArray.add(n);
                }
            }
        for (char n: abcArray) {
            int count = 0;
            for (int i = 0; i < xArray.size(); i++) {
                if(xArray.get(i) == n) count++;
            }
            if (count==0) continue;
            System.out.println(n + " " + count);
        }

/*          экземплярКоллекции.forEach(Класс::метод);
            экземплярКоллекции.forEach((ЭлементКоллекции) -> функция(ЭлементКоллекции));
            экземплярКоллекции.forEach((ЭлементКоллекции) -> {
                   // здесь можно делать все, что угодно:
                   // вводить новые переменные и пр.
                   // однако будьте бдительны, метод forEach имеет тип void,
                   // а значит напрямую вернуть из него ничего не выйдет.
                   // return может быть использован для выхода из метода, скажем, по условию.
            });

*/

        String whole_text = list.toString();
        alphabet.forEach(ach -> System.out.println(ach + " " + whole_text.chars().filter(ch -> ch ==ach).count()));

// +2
        for (Character ch : alphabet) {
            int count = 0;
            for (String str : list) {
                for (int j = 0; j < str.length(); j++) {
                    if (ch == str.charAt(j)) count++;
                }
            }
            System.out.println(ch + " " + count);
        }
// +3
        for(Character ch : alphabet){                  //перебрали алфавит
            int count = 0;
            for(String string : list){                //перебрали строки введенные с клавиатуры
                char[] chars = string.toCharArray();  //каждую строку разбираем на массив
                for(char c : chars){                  //перебираем массив
                    if(ch == c){
                        count++;
                    }
                }
            }
            System.out.println(ch + " " + count);
        }
    }
}

