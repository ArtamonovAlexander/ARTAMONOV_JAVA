package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {
    }
    
    static {
        result = null;
       try {
           reset();
       }catch (IOException e){
           e.printStackTrace();
       }
    }

    public static CanFly result;

    public static void reset() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int param;
            if (name.equals("Helicopter")){
                result = new Helicopter();
            }
            if (name.equals("plane")){
                try {
                    param = Integer.parseInt(reader.readLine());
                    result = new Plane(param);
                }catch (IOException e){
                    System.out.println(e);
                }
            }
            else System.out.println("Что-то не так с вводом");
            reader.close();
    }
}
