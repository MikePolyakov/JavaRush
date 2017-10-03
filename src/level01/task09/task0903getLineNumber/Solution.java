package level01.task09.task0903getLineNumber;

/*
Кто меня вызывал?

Написать пять методов, которые вызывают друг друга.
Метод должен вернуть номер строки кода, из которого вызвали этот метод.
Воспользуйся функцией: element.getLineNumber().


Требования:
1. В классе должно быть 5 методов (метод main не учитывать).
2. Каждый метод должен вызывать следующий: main вызывать method1, method1 вызывать method2 и т.д.
3. Каждый метод должен возвращать номер строки кода, из которого вызвали этот метод.
4. Для получения номера строки, используй метод getLineNumber класса StackTraceElement.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static int method1() {
        method2();
        StackTraceElement[] a = Thread.currentThread().getStackTrace();
        System.out.println("Я метод "+a[1].getMethodName());
        System.out.println("Меня вызвал "+a[2].getMethodName());
        System.out.println("Вызов произошел из строки номер "+a[2].getLineNumber());
        return  a[2].getLineNumber();
        //решение в одну строку:
        //return Thread.currentThread().getStackTrace()[2].getLineNumber();
        //дополнительно, как вызвать весь поток методов:
        //for (StackTraceElement b:a){
        //    System.out.println("Метод по очереди "+b.getMethodName());
        //}
    }

    public static int method2() {
        method3();
        StackTraceElement[] s = Thread.currentThread().getStackTrace();
        int codeLine = s[2].getLineNumber();
        System.out.println(codeLine);
        return codeLine;
    }

    public static int method3() {
        method4();
        StackTraceElement[] s = Thread.currentThread().getStackTrace();
        int codeLine = s[2].getLineNumber();
        System.out.println(codeLine);
        return codeLine;
    }

    public static int method4() {
        method5();
        StackTraceElement[] s = Thread.currentThread().getStackTrace();
        int codeLine = s[2].getLineNumber();
        System.out.println(codeLine);
        return codeLine;
    }

    public static int method5() {
        StackTraceElement[] s = Thread.currentThread().getStackTrace();
        int codeLine = s[2].getLineNumber();
        System.out.println(codeLine);
        return codeLine;
    }
}

