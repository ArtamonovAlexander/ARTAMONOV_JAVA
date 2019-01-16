package com.javarush.task.ITpark3;


import java.util.Random;

public class Task18 {
    public static void main(String[] args) {
        int array[][] = new int[5][5];
        int array2[][] = new int[5][5];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
                array2[i][j] = random.nextInt(10);
            }
        }
        MatrixWorker.print(array2);
        MatrixWorker.print(array);
        MatrixWorker.sum(array, array2);
        MatrixWorker.print(array);
        MatrixWorker.mult(array, array2);
        MatrixWorker.print(array);
    }
}



