package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String [] arr = new String[10];
        arr[0] = "101";
        arr[1] = "102";
        Scanner sc = new Scanner(System.in);

        for (int i = 2; i < arr.length ; i++) {
            arr[i] = sc.nextLine();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[9 - i]);
        }

    }
}