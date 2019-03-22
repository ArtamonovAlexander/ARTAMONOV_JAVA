package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String nameOne = scanner.nextLine();
        String nameTwo = scanner.nextLine();

        if(nameOne.equals(nameTwo)) System.out.println("Имена идентичны");
        else {
            if(nameOne.length() == nameTwo.length())
                System.out.println("Длины имен равны");
        }

    }
}
