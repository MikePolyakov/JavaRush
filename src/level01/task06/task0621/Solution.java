package level01.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
Родственные связи кошек
У каждой кошки есть имя, кошка-папа и кошка-мама.
Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку (папин папа), бабушку (мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFatherName = reader.readLine();
        Cat catGrandFather = new Cat(grandFatherName);

        String grandMotherName = reader.readLine();
        Cat catGrandMother = new Cat(grandMotherName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, catGrandFather, null );

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, null, catGrandMother);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catFather, catMother);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catFather, catMother);


        System.out.println(catGrandFather);
        System.out.println(catGrandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat
    {
        private String name;
        private Cat parentMother;
        private Cat parentFather;


        Cat(String name) {
            this.name = name;
        }


        Cat(String name, Cat parentFather, Cat parentMother) {
            this.name = name;
            this.parentFather = parentFather;
            this.parentMother = parentMother;
        }


        @Override
        public String toString() {
            if (parentMother == null && parentFather == null)
                return "Cat name is " + name + ", no mother" + ", no father.";
            else if (parentFather == null)
                return "Cat name is " + name + ", mother is " + parentMother.name + ", no father.";
            else if (parentMother == null)
                return "Cat name is " + name + ", no mother" + ", " + "father is " + parentFather.name + ".";
            else return "Cat name is " + name + ", mother is " + parentMother.name + ", father is " + parentFather.name + ".";

        }
    }
}