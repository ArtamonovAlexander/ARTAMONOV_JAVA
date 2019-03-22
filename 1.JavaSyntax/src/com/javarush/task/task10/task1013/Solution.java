package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static class Human {
        private byte age;
        private int growth;
        private boolean sex;
        private String name;
        private  int weight;
        private long time;

        public Human(int growth, boolean sex, String name, int weight) {
            this.growth = growth;
            this.sex = sex;
            this.name = name;
            this.weight = weight;
        }
        public Human(byte age) {this.age = age;}

        public Human(){ }

        public Human(String name){this.name = name; }

        public Human(String name, int growth){
            this.name = name;
            this.growth = growth;
            System.out.println("У"+ name+" высота на "+ growth);}

        public Human(String name, byte age){
            this.name = name;
            this.age = age;
        }
        public Human(String name, byte age, boolean sex){
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
        public Human(boolean sex){this.sex = sex;}

        public Human (int weight){
            this.name = name;
        }
        public Human(int weight, int growth){
            this.weight = weight;
            this.growth = growth;
        }
    }
}
