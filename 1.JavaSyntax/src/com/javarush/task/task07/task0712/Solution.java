package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        int max, min, a = 0, b = 0;
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextLine());
        }
        min = list.get(0).length();
        max = list.get(0).length();

        for (int i = 0; i < list.size(); i++) {
            if (min > list.get(i).length()) {
                min = list.get(i).length();
                a = i;
            }
            if (max < list.get(i).length()) {
                max = list.get(i).length();
                b = i;
            }
        }
        if (a > b) System.out.println(list.get(b));
        else System.out.println(list.get(a));

    }
}
