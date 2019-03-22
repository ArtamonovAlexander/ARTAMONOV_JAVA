package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        int x;
  //      int x1;
        x = age % 4;
        if(x != 0)
            System.out.println("количество дней в году: 365");
        if(x == 0) {
            x = age % 100;
            if(x != 0)
            System.out.println("количество дней в году: 366");
            else  {
                x = age % 400;
                if (x == 0)
                    System.out.println("количество дней в году: 366");
                else
                    System.out.println("количество дней в году: 365");}}
            }
    }
