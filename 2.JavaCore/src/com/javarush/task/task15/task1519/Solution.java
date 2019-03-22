package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputText;
        int inputInt;
        Double inputDouble;
        short inputShort;


        while (!(inputText = reader.readLine()).equals("exit")) {

            if (inputText.contains(".")) {
                try {
                    inputDouble = Double.parseDouble(inputText);
                    print(inputDouble);
                } catch (NumberFormatException e) {
                    print(inputText);
                }
            }else
            try {
                inputInt = Integer.parseInt(inputText);
                if (inputInt <= 0 || inputInt >= 128) {
                    print(inputInt);
                } else if (inputInt > 0 && inputInt < 128) {
                    inputShort = (short) inputInt;
                    print(inputShort);
                }
            } catch (NumberFormatException e) {
                print(inputText);
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
