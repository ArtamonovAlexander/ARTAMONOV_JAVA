package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int x=0, i=0;
        while (i != -1){
           i = scanner.nextInt();
            x += i;}

        System.out.println(x);

    }
}
