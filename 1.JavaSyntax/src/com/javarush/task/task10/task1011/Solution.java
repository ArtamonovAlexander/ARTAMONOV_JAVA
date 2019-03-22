package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        String d = "зарплату";

        for (int i = 0; i < s.length(); i++) {
            String text = s.substring(i);
            if (!text.contains(d)) {break;}
            System.out.println(s.substring(i));
        }
    }
}

