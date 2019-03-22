package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> children = new ArrayList<>();
        children.add(new Human("child1", true, 3));
        children.add(new Human("child2", true, 4));
        children.add(new Human("child3", false, 5));

        ArrayList<Human> children1 = new ArrayList<>();
        children1.add(new Human("Nikolay", true, 32, children));
        ArrayList<Human> children3 = new ArrayList<>();
        children3.add(new Human("Mila", false, 30, children));

        ArrayList<Human> parent = new ArrayList<>();
        parent.add(new Human("grandfather", true, 82, children1));
        parent.add(new Human("grandmother", false, 81, children1));
        parent.add(new Human("grandfather2", true, 90, children3));
        parent.add(new Human("grandmother2", false, 79, children3));

        for (Human j : parent){
            System.out.println(j.toString());
        }
        for (Human j : children1){
            System.out.println(j.toString());
        }
        for (Human j : children3){
            System.out.println(j.toString());
        }
        for (Human j : children){
            System.out.println(j.toString());
        }

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

    public Human (String name, boolean sex, int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public Human (String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;

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
