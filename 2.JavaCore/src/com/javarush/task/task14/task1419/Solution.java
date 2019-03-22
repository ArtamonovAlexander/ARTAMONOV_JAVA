package com.javarush.task.task14.task1419;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception

        try {
            int[] arr = {5, 2, 3};
            arr[5] = 4;
        } catch (ArrayIndexOutOfBoundsException e) {
            exceptions.add(e);
        }
//         try {
//            float i = 1 / 0;
//        } catch (Exception e) {
//            exceptions.add(e);
//        }

        try {
            int x = 0;
            if (x == 0)
                throw new ArithmeticException();
        } catch (ArithmeticException e) {
            exceptions.add(e);
        }

        try {
            int x = 0;
            if (x == 0)
                throw new ArrayStoreException();
        } catch (ArrayStoreException e) {
            exceptions.add(e);
        }

        try {
            int x = 0;
            if (x == 0)
                throw new ClassCastException();
        } catch (ClassCastException e) {
            exceptions.add(e);
        }

        try {
            int x = 0;
            if (x == 0)
                throw new NullPointerException();
        } catch (NullPointerException e) {
            exceptions.add(e);
        }

        try {
            int x = 0;
            if (x == 0)
                throw new IllegalMonitorStateException();
        } catch (IllegalMonitorStateException e) {
            exceptions.add(e);
        }

        try {
            int x = 0;
            if (x == 0)
                throw new NumberFormatException();
        } catch (NumberFormatException e) {
            exceptions.add(e);
        }

        try {
            int x = 0;
            if (x == 0)
                throw new FileNotFoundException();

        } catch (FileNotFoundException e) {
            exceptions.add(e);
        }


        try {
            int x = 0;
            if (x == 0)
                throw new NegativeArraySizeException();

        } catch (NegativeArraySizeException e) {
            exceptions.add(e);
        }

        try {
            int x = 0;
            if (x == 0)
                throw new SecurityException();
        } catch (SecurityException e) {
            exceptions.add(e);
        }

    }
}
