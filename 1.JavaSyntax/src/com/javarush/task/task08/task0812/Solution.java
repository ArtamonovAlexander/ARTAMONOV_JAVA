package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(sc.nextInt());
        }
        int x = 1;
        int y = 1;
        for (int i = 1; i < list.size(); i++) {
            if ((list.get(i - 1)).equals(list.get(i))) ++x;
            else{
             if (y < x) y = x; x=1;
            if (y >= x) x = 1;}}

            if (y < x) y = x;
            System.out.println(y);

    }
}
