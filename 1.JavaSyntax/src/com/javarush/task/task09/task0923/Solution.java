package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine().replaceAll("\\s+","");;
   //     text.replaceAll("\\s+","");
        char[] letters = text.toCharArray();
        for (char dre : letters) {
            if (isVowel(dre)) System.out.print(dre + " ");
        }
        System.out.println();
        for (char dre : letters) {
            if (!isVowel(dre)) System.out.print(dre + " ");
        }

    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}