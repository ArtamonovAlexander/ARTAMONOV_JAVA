package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        ArrayList<String> list = new ArrayList();
        String value = "";

        int n = url.indexOf('?');
        String urlMin = url.substring(n + 1);

        for (String tmp : urlMin.split("&")) {
            int i = 0;
            for (String st : tmp.split("=")) {
                if (i == 0){
                    i++;
                    list.add(st);
                }
                if (st.contentEquals("obj")){
                    value = tmp.substring(4);
                }
            }
        }

        for (String b : list) {
            System.out.print(b + " ");
        }
        System.out.println();

        if (value != ""){
            try {
                alert(Double.parseDouble(value));
            }catch (Exception e){
                alert(value);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
