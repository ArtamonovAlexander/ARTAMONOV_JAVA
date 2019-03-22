package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String[] str = new String[10];
        int[] ch = new int[10];

        for (int i = 0; i < str.length ; i++) {
            str[i] = scanner.nextLine();
            ch[i] = str[i].length();
        }
        for (int i = 0; i < str.length; i++) {
            System.out.println(ch[i]);
        }
    }
}
