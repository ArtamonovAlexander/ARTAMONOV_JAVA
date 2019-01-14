package com.javarush.task.ITpark3;

import java.util.Random;

public class Task17 {
    public static void main(String[] args) {
        int array[][] = new int[4][];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = new int[random.nextInt(4) + 1];
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}