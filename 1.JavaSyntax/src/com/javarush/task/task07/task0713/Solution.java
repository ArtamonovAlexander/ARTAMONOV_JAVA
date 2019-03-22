package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++) {
            list.add(sc.nextInt());
            int a = list.get(i);
            if(a%3 == 0) list3.add(list.get(i));
            if(a%2 == 0) list2.add(list.get(i));
            if(a%2 !=0 && a%3 != 0) list1.add(list.get(i));
        }
        printList(list3);
        printList(list2);
        printList(list1);

    }

    public static void printList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) { System.out.println(list.get(i)); }
    }
}
