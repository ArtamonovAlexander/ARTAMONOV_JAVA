package com.javarush.task.task01.task0133;
import java.util.Scanner;
/* 
Не думать о секундах…
*/

public class Solution {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    System.out.println(i);
                }
            }
        }
    }


