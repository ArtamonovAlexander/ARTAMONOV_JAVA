package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Fam", "Ima0");
        map.put("Fam2", "Ima");
        map.put("Fam3", "Ima3");
        map.put("Fam4", "Ima");
        map.put("Fam5", "Ima5");
        map.put("Fam6", "Ima6");
        map.put("Fam7", "Ima7");
        map.put("Fam8", "Ima");
        map.put("Fam9", "Ima");
        map.put("Fam10", "Ima10");
            return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()){
            int frequency = Collections.frequency(copy.values(), pair.getValue());
            if (frequency > 1){removeItemFromMapByValue(map, pair.getValue());}
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
