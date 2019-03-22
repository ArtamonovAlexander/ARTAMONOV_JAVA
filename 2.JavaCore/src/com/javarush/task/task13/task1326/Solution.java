package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader buffReader = new BufferedReader(new InputStreamReader(new FileInputStream(read.readLine())));

        ArrayList<Integer> array = new ArrayList<>();
        String line;

        while ((line = buffReader.readLine()) != null) {
            int x = Integer.parseInt(line);
            if (x % 2 == 0) {
                array.add(x);
            }
        }
        Collections.sort(array);
        for (int number:array) {
            System.out.println(number);
        }
        read.close();
        buffReader.close();
    }
}