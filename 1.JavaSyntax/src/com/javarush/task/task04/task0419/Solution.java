package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = reader.readLine();
        int a = Integer.parseInt(a1);
        String a2 = reader.readLine();
        int b = Integer.parseInt(a2);
        String a3 = reader.readLine();
        int c = Integer.parseInt(a3);
        String a4 = reader.readLine();
        int d = Integer.parseInt(a4);

        System.out.println(Math.max(Math.max(a, b), Math.max(c, d)));





    }
}
