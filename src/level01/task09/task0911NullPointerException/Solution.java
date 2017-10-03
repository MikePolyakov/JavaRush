package level01.task09.task0911NullPointerException;

import java.util.HashMap;

/*
Исключение при работе с коллекциями Map

Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
HashMap<String, String> map = new HashMap<String, String>(null);
map.put(null, null);
map.remove(null);

Требования:
1. Программа должна выводить сообщение на экран.
2. В программе должен быть блок try-catch.
3. Программа должна отлавливать исключения конкретного типа, а не все возможные (Exception).
4. Выведенное сообщение должно содержать тип возникшего исключения.
5. Имеющийся код в методе main не удалять.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        System.out.println("Program starts");
        try {
            System.out.println("Before...");
            HashMap<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);
        }
        //напишите тут ваш код
        catch (NullPointerException e)
        {
            System.out.println(e);
        }
    }
}
