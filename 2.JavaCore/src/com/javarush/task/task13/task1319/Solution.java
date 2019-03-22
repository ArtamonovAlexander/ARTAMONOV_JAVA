package com.javarush.task.task13.task1319;

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));

        while (!(fileName).equals("exit")){
            fileName = reader.readLine();
            bufferedWriter.write(fileName + "\r\n" );
           }

        reader.close();
        bufferedWriter.close();
    }
}
