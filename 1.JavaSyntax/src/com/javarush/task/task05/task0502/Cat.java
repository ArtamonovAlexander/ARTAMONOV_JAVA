package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {

            int score1 = this.age+this.weight+this.strength;
            int score2 = anotherCat.age+anotherCat.weight+anotherCat.strength;
            return(score1>score2);
    }

    public static void main(String[] args) {
    }
}
