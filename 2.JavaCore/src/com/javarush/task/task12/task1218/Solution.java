package com.javarush.task.task12.task1218;

/* 
Есть, летать и двигаться
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public  class Dog implements CanMove, CanEat {
        public void move(){
            System.out.println("Чап-Чап!");
        }
        public void eat(){
            System.out.println("Am-Am!");
        }
    }

    public class Duck implements CanEat, CanFly, CanMove {
        public void move(){
            System.out.println("Чап-Чап!");
        }
        public void eat(){
            System.out.println("Am-Am!");
        }
        public void fly(){
            System.out.println("Кар-Кар!");
        }
    }

    public class Car implements CanMove {
        public void move(){
            System.out.println("Чап-Чип!");
        }
    }

    public class Airplane implements CanMove, CanFly{
        public void move(){
            System.out.println("Чап-Чап!");
        }
        public void fly(){
            System.out.println("Кар-Кар!");
        }
    }
}
