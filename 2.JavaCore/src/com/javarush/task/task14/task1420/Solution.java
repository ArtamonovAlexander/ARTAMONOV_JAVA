package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = 0;
        int y = 0;
        int NOD = 0;
   //     try {
            x = Integer.parseInt(reader.readLine());
            y = Integer.parseInt(reader.readLine());
   //     } catch (Exception e) {
   //         System.out.println(e);
   //     }
        if (x <= 0 || y <= 0) throw new Exception();
        if (x > y) {
            for (int i = 1; i <= y; i++) {
                if (x % i == 0 && y % i == 0) {
                    NOD = i;
                }
            }
        }else for (int i = 1; i <= x; i++) {
            if (x % i == 0 && y % i == 0) {
                NOD = i;
            }
        }
        System.out.println(NOD);
    }
}
