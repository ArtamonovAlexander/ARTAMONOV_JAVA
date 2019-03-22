package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double t = scanner.nextDouble();
       int b;
       double a = 0;
       double c = 0;
        if(t >= 5) {
            a = t / 5;
            b = (int) a;
            c = t - b*5;

            if(c < 3)
                System.out.println("зеленый");
            if(c >= 3 && c < 4)
                System.out.println("желтый");
            if(c >= 4)
                System.out.println("красный");
             }
        else {
            if(t < 3)
                System.out.println("зеленый");
            if(t >= 3 && t < 4)
                System.out.println("желтый");
            if(t >= 4)
                System.out.println("красный");}





    }
}