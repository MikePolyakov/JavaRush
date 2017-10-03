package level01.task09.task0923RussianVowels;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Гласные и согласные

Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы из введённой строки.
2. вторая — только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.
Пример ввода:
Мама мыла раму.

Пример вывода:
а а ы а а у
М м м л р м .


Требования:
1. Программа должна считывать данные с клавиатуры.
2. Программа должна выводить две строки.
3. Первая строка должна содержать только гласные буквы из введенной строки, разделенные пробелом.
4. Вторая строка должна содержать только согласные и знаки препинания из введенной строки, разделенные пробелом.
5. Каждая строка должна заканчиваться пробелом.
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
 /*       Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        ArrayList<Character> list0 = new ArrayList<>();
        for (int i = 0; i < s.length(); i++){
           char c = s.charAt(i);
           if( c != ' ') list0.add(c);
        }
        for(Character element : list0) System.out.print(element);
        System.out.println();

        ArrayList<Character> list1 = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();
        for(int i = 0; i < list0.size(); i++){
            char c = list0.get(i);

            if (isVowel(c)) {
                list1.add(c);
                list1.add(' ');
            }
            else {
                list2.add(c);
                list2.add(' ');
            }
        }
        for(Character element : list1) System.out.print(element);
        System.out.println();
        for(Character element : list2) System.out.print(element);
*/

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s = r.readLine().replace(" ", "");
        String vow = "";
        String cons = "";

        for (int i = 0; i < s.length(); i++){
            if (isVowel(s.charAt(i))){
                vow = vow + s.charAt(i) + " ";
            }
            else {
                cons = cons + s.charAt(i) + " ";
            }
        }

        System.out.println(vow);
        System.out.println(cons);

    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}
