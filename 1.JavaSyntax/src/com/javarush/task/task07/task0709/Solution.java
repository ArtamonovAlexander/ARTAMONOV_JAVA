package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextLine());
        }
        int min = list.get(0).length(); // передаем в мин длинну первой строки

        for (int i = 0; i < list.size(); i++) {
            if (min > list.get(i).length())
                min = list.get(i).length(); // если значие длинны какой-то из строк меньше, то мы перезаписываем туда это значение
        }
            for (int i = 0; i < list.size(); i++) {
                if (min == list.get(i).length()) System.out.println(list.get(i)); // ищем строки с нашим минимальным значением длинны в массиве и если находим, то выводим её.
            }

    }
}
