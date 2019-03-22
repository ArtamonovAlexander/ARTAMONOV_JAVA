package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;
import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = 0, b=0, c=0, x=0, z = 0;

       a = scanner.nextInt();
       b = scanner.nextInt();
       c = scanner.nextInt();
       x = min(min(a, b), c);
       z = max(max(a, b), c);

        System.out.println( a + b + c - z - x);
    }
}
