package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/

public class StringHelper {
    public static String multiply(String s) {
        String result = "";
        StringBuilder br = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            br.append(s);
        }
        result = br.toString();
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        StringBuilder br = new StringBuilder();
        for (int i = 0; i < count; i++) {
            br.append(s);
        }
        result = br.toString();
        return result;
    }

    public static void main(String[] args) {
        System.out.println(multiply("Амиго"));
        System.out.println(multiply("Амиго", 3));
    }
}
