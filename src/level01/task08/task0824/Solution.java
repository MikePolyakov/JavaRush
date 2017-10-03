package level01.task08.task0824;

import java.util.ArrayList;
import java.io.IOException;

/*
Собираем семейство

1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.


Требования:
1. Программа должна выводить текст на экран.
2. Класс Human должен содержать четыре поля.
3. Класс Human должен содержать один метод.
4. Класс Solution должен содержать один метод.
5. Программа должна создавать объекты и заполнять их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
*/



public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<Human> children = new ArrayList<Human>();
        ArrayList<Human> parents1 = new ArrayList<Human>();
        ArrayList<Human> parents2 = new ArrayList<Human>();

        Human son1 = new Human( "сынка1", true, 25);
        Human daughter = new Human("дочка"  , false, 20);
        Human son2 = new Human("сынка2", true, 17);
        children.add(son1);
        children.add(daughter);
        children.add(son2);

        Human man = new Human("отец",true, 51, children);
        Human woman = new Human("мать",false, 41, children);
        parents1.add(man);
        parents2.add(woman);

        Human ded1 = new Human("ded1", true, 71, parents1);
        Human ded2 = new Human("ded2", true, 72, parents2);
        Human b1 = new Human( "b1", false, 61, parents1);
        Human b2 = new Human( "b2", false, 62, parents2);

        System.out.println(ded1);
        System.out.println(b1);
        System.out.println(ded2);
        System.out.println(b1);
        System.out.println(man);
        System.out.println(woman);
        System.out.println(son1);
        System.out.println(daughter);
        System.out.println(son2);
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) { //Конструктор для тех у кого есть дети(мама, батя, бабки и дедки)
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public Human(String name, boolean sex, int age) { // Конструктор для детей
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<Human>();
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}

