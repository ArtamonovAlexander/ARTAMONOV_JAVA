package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human h1 = new Human("Вика", false, 62);
        Human h2 = new Human("Тимур", true, 62);
        Human h3 = new Human("Кира", false, 72);
        Human h4 = new Human("Ларик", true, 66);
        Human h5 = new Human("Римма", false, 42, h2, h1);
        Human h6 = new Human("Игорь", true, 45, h4, h3);
        Human h7 = new Human("Софья", false, 2, h6, h5);
        Human h8 = new Human("Ирек", true, 6, h6, h5);
        Human h9 = new Human("Алиса", false, 4, h6, h5);
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
        System.out.println(h4);
        System.out.println(h5);
        System.out.println(h6);
        System.out.println(h7);
        System.out.println(h8);
        System.out.println(h9);

    }

    public static class Human {
        int age; boolean sex; Human mother; Human father; String name;

        public Human (String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human (String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















