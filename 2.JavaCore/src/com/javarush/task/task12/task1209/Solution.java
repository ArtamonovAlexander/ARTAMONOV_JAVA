package com.javarush.task.task12.task1209;

/* 
Три метода и минимум
*/

public class Solution {
    public static void main(String[] args) {
        min(5,7);
        min(434354534,87);
        min(1.2,3.1);
    }

    public static int min(int a, int b){
        if (a < b) {
            return a;
        } else return b;
    }
    public static long min(long a, long b){
        if (a < b) {
            return a;
        } else return b;
    }
    public static double min(double a, double b){
        if (a < b) {
            return a;
        } else return b;
    }
}
