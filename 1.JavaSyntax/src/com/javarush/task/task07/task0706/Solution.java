package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[15];
        Scanner sc = new Scanner(System.in);
        int x=0;
        int y=0;
        for (int i = 0; i < 15; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 15; i++) {
            if(i % 2 == 0){ x = x + arr[i];}
            else { y = y + arr[i];}
        }
        if (x>y)
        System.out.println("В домах с четными номерами проживает больше жителей.");
        else System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
