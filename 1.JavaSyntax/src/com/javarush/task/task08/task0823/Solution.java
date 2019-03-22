package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       // System.out.println("Введи: ");
        String s = reader.readLine();
        StringBuilder s1 = new StringBuilder(s);
        s1.setCharAt(0, Character.toUpperCase(s1.charAt(0)));
        for (int i = 0; i<s1.length()-1; i++){
            if (Character.isSpaceChar(s.charAt(i))){
                s1.setCharAt(i+1, Character.toUpperCase(s1.charAt(i+1)));
            }
         }
        System.out.println(s1);
      }
}
