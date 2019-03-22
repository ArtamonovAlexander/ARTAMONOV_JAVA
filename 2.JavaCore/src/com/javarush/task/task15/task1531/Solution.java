package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        if (n < 0) {
            n = 0;
            return String.valueOf(n);
        }
        if (n == 0 || n == 1) {
            n = 1;
            return String.valueOf(n);
        }
        else if (n > 1 && n <= 150) {
            BigInteger ret = BigInteger.ONE;
            for (int i = 1; i <= n; ++i) ret = ret.multiply(BigInteger.valueOf(i));
            return  String.valueOf(ret);
        }
        else System.out.println("Что-то не то ввел.");
        return "";
    }
}
