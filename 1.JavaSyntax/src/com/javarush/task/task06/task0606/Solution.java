package com.javarush.task.task06.task0606;

import java.io.*;


/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] num = reader.readLine().toCharArray();

        for (int i = 0; i < num.length; i++) {
            if (num[i]%2 == 0)
                even++;
            else odd++;
        }
        System.out.println( "Even: " + even + " Odd: " + odd);
    }
}
