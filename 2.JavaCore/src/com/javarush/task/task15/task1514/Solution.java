package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static {
        labels.put(3.6d, "J");
        labels.put(4.3,"srf");
        labels.put(2.3,"s");
        labels.put(1.3,"f");
        labels.put(4.2,"rsf");

    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
