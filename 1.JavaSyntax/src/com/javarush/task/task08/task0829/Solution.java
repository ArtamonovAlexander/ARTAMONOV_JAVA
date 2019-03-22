package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // List of addresses
        HashMap <String, String> addresses = new HashMap<>();
        while (true) {
            String key0 = reader.readLine();
            if (key0.isEmpty()) break;
            String value0 = reader.readLine();
            if (value0.isEmpty()) break;

            addresses.put(key0, value0);
        }

        // Read the house number
        String city = reader.readLine();

        if (city != null) {
            String familyName = addresses.get(city);
            System.out.println(familyName);
        }
    }
}
