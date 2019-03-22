package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int chislo = scanner.nextInt();

        if(chislo > 0)
            System.out.println(chislo*2);
        if(chislo < 0)
            System.out.println(chislo + 1);
        if(chislo == 0)
            System.out.println(0);

    }

}