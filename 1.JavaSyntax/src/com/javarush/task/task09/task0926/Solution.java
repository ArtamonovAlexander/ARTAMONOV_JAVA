package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        fullList(list);
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> myArray = new ArrayList<>();
        myArray.add(new int[5]);
        myArray.add(new int[2]);
        myArray.add(new int[4]);
        myArray.add(new int[7]);
        myArray.add(new int[0]);

        return myArray;
    }
    public static void fullList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int i = 0; i < array.length; i++) {
                int x = (int) (Math.random() * 100);
                array[i] = x;
            }
        }
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
