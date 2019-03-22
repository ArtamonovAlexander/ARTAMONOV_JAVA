package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] big = new int[20];
        int[] small1 = new int[10];
        int[] small2 = new int[10];

        for (int i = 0; i < big.length; i++) {
            big[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            small1[i] = big[i];
        }
        for (int i = 0; i < 10; i++) {
                small2[i] = big[i+10];
            }
        for (int i = 0; i < small2.length; i++) {
            System.out.println(small2[i]);
//        }
        }
    }
}