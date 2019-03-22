package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.SequenceInputStream;
import java.util.Scanner;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        Scanner scanner = new Scanner(System.in);
        String readString = scanner.nextLine();
        return readString;
    }

    public static int readInt() throws Exception {
        Scanner scanner = new Scanner(System.in);
        int readInt = scanner.nextInt();
        return readInt;
    }

    public static double readDouble() throws Exception {
        Scanner scanner = new Scanner(System.in);
        double readDouble = scanner.nextDouble();
        return readDouble;
    }

    public static boolean readBoolean() throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean readBoolean = scanner.nextBoolean();
        return readBoolean;

    }

    public static void main(String[] args) {

    }
}
