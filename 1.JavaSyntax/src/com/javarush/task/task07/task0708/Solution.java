package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings = new ArrayList<String>();

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int m = 0;
        for (int i = 0; i < 5; i++) {
            strings.add(sc.nextLine());
            if( m < strings.get(i).length()) m = strings.get(i).length();
        }
//        String max = null;
        for (int i = 0; i < strings.size(); i++) {
        if(m == strings.get(i).length()) System.out.println(strings.get(i));
        }
    }
}
