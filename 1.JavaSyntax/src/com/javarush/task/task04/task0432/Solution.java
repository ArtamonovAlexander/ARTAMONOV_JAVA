package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int b = scanner.nextInt();

        while (b>0){
            b--;
            System.out.println(a);
        }

    }
}
