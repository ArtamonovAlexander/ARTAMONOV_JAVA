package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Date date = new SimpleDateFormat("y-MM-dd").parse(sc.nextLine());
        SimpleDateFormat df = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        System.out.println(df.format(date).toUpperCase());

    }
}
