package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int[] arrayNumbers;
    public static int sum;
    public static int sumInThread;

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int threadsCount = scanner.nextInt();
        int numbersCount = scanner.nextInt();

        // TODO: генерируете массив чисел
        arrayNumbers = new int[numbersCount];
        for (int i = 0; i < numbersCount; i++) {
            arrayNumbers[i] = random.nextInt(1000);
            sum += arrayNumbers[i];
        }
        // TODO: выводите их сумму
        System.out.println("Сумма чисел в массиве " + sum);


        // TODO: создаете массив потоков
        Counter[] arrayThread = new Counter[threadsCount];
        // TODO: каждому потоку назначете свой участок
        int from = 0;
        int to = numbersCount / threadsCount;
        for (int i = 0, k = numbersCount / threadsCount; i < threadsCount; i++) {
            arrayThread[i] = new Counter(from, to, arrayNumbers);
            from += k;
            to += k;
        }
        // TODO: запускаете каждый поток
        for (int i = 0; i < threadsCount; i++) {
            arrayThread[i].start();
            arrayThread[i].join();
            System.out.println(arrayThread[i].getSumResult());
        }

        // TODO: здесь у каждого потока берете sumResult и складываете, смотрите результат.
        for (int g = 0; g < threadsCount; g++) {
            sumInThread += arrayThread[g].getSumResult();
        }
        System.out.println("сумма sumResult " + sumInThread);
    }
}

