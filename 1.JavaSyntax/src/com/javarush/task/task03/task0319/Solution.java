package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String Age1 = reader.readLine();
        String Age2 = reader.readLine();
        System.out.print(name + " получает " + Age1 + " через " + Age2 + " лет.");

    }
}
