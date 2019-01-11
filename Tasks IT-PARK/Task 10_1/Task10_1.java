package com.javarush.task.ITpark3;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char text1[] = scanner.nextLine().toCharArray();
        char text2[] = scanner.nextLine().toCharArray();
        equallyString(text1, text2, 0, 0 ,0);
//        int value1 = 0;
//        int value2 = 0;
//
//        for (int i = 0; i < text1.length; i++) {
//            if (text1[i] == text2[0]) {
//                for (int j = 0; j < text2.length; j++) {
//                    value1 = (int) text1[i + j];
//                    value2 = (int) text2[j];
//                }
//                if (value1 == value2) {
//                    System.out.println("Congratulations");
//                    System.out.println("¬хождение второй строки в первую начинаетс€ с индекса " + i);
//                }
//            }
//        }
    }

    public static int equallyString(char[] text1, char[] text2, int index, int value1,int value2){
        if (index > text1.length) return index;
        equallyString(text1, text2, index + 1, value1,value2);
        if (text1[text1.length - index] == text2[0]) {                                  // не нашел ошибку ArrayIndexOutOfBoundsException
            for (int j = 0; j < text2.length; j++) {
                value1 = (int) text1[text1.length - index + j];
                value2 = (int) text2[j];
            }
            if (value1 == value2) {
                System.out.println("Congratulations");
                System.out.println("¬хождение второй строки в первую начинаетс€ с индекса " + (text1.length - index));
            }
        }
        return text1.length - index;
    }
}