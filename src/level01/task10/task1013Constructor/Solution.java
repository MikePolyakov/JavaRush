package level01.task10.task1013Constructor;

/*
Конструкторы класса Human

Напиши класс Human с 6 полями.
Придумай и реализуй 10 различных конструкторов для него.
Каждый конструктор должен иметь смысл.


Требования:
1. Программа не должна считывать данные с клавиатуры.
2. В классе Human должно быть 6 полей.
3. Все поля класса Human должны быть private.
4. В классе Human должно быть 10 конструкторов.
5. Все конструкторы класса Human должны быть public.
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private String name;
        private String lastName;
        private Human father;
        private Human mother;
        private boolean sex;
        private int age;
        //1
        public Human() {
        }
        //2
        public Human(String name) {
            this.name = name;
        }
        //3
        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        //4
        public Human(String name, String lastName) {
            this.name = name;
            this.lastName = lastName;
        }
        //5
        public Human(String name, String lastName, int age) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
        }
        //6
        public Human(String name, String lastName, boolean sex) {
            this.name = name;
            this.lastName = lastName;
            this.sex = sex;
        }
        //7
        public Human(String name, String lastName, boolean sex, int age) {
            this.name = name;
            this.lastName = lastName;
            this.sex = sex;
            this.age = age;
        }
        //8
        public Human(String lastName,  boolean sex, int age, Human mother) {
            this.lastName = lastName;
            this.sex = sex;
            this.age = age;
            this.mother = mother;
        }
        //9
        public Human(String lastName, Human father, boolean sex, int age) {
            this.name = lastName;
            this.father = father;
            this.sex = sex;
            this.age = age;
        }
        //10
        public Human(String name, String lastName, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.lastName = lastName;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
    }
}
