package com.javarush.task.task09.task0919;

/* 
Деление на ноль
*/

public class Solution {

    public static void main(String[] args) {
        try {
            divisionByZero();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }


    public static void divisionByZero() {
    int x = 36/0;
        System.out.println(x);
    }
}
