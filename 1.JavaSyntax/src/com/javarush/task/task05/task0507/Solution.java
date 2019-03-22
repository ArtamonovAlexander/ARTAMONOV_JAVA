package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        double i = 0;
        double x = 0;
        int a = 0;
        Scanner scanner = new Scanner(System.in);


        while (i != -1) {
            i = scanner.nextDouble();
            if (i != -1){
            x += i;
            a++;}
        }

        System.out.println(x / a);



    }
}

