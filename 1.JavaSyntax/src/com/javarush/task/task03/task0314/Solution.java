package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {

        int i = 0;
        int d = 1;
        do {
            i++;

            do {
                System.out.print(i * d + " ");
                d++;
            }
            while (d <= 10);
            System.out.println();
            d = 1;
        }
        while (i != 10);

    }

}

