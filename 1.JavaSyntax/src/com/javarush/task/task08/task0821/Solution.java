package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
            }

    public static Map<String, String> createPeopleList() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Lisin", "Vasj");
        map.put("Risin", "Masj");
        map.put("Lis", "Rasj");
        map.put("Lisin", "Dasj");
        map.put("Lisan", "Dasj");
        map.put("Lisin", "Gasj");
        map.put("Lis", "Fasj");
        map.put("Livan", "Vasj");
        map.put("Pisin", "Vasj");
        map.put("Misin", "Vasj");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
