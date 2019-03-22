package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] list = new int[20];
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        for (int i = 0; i < list.length; i++) {list[i] = Integer.parseInt(reader.readLine());}
        for (int i = 0; i < list.length; i++) { maximum = Math.max(maximum, list[i]); }
        for (int i = 0; i < list.length; i++) { minimum = Math.min(minimum, list[i]); }


        System.out.print(maximum + " " + minimum);
    }
}
