package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if(number==0) System.out.println("ноль");
        if(number%2==0 && number < 0) System.out.println("отрицательное четное число");
         if(number%2!=0 && number < 0) System.out.println("отрицательное нечетное число");
         if(number%2==0 && number > 0) System.out.println("положительное четное число");
        if(number%2!=0 && number > 0) System.out.println("положительное нечетное число");




    }
}
