package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        int x = a +b;
        return x;
    }

    public static int minus(int a, int b) {
        int x = a - b;
        return x;
    }

    public static int multiply(int a, int b) {
        int x = a * b;
        return x;
    }

    public static double division(int a, int b) {
        return  ((double) a) / b;
    }

    public static double percent(int a, int b) {
        return  ((double)a)/100 * b;
    }

    public static void main(String[] args) {
        System.out.println(division(5, 4) );
        System.out.println(percent(5,4));
    }
}