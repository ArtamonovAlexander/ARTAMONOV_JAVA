package com.javarush.task.task12.task1210;

/* 
Три метода и максимум
*/

public class Solution {
    public static void main(String[] args) {
        max(5,3);
        max(23,6);
        max(1.3,31.12);
    }

    public static int max(int a, int b){
        return Math.max(a,b);
    }
    public static long max(long a, long b){
        return Math.max(a,b);

    }
    public static double max(double a, double b){
        return Math.max(a,b);

    }
}
