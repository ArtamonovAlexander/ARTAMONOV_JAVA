package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        int min = Collections.min(array);
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        List <Integer> integerList = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inter N: ");
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            integerList.add(i, scanner.nextInt());
        }

        return integerList;
    }
}
