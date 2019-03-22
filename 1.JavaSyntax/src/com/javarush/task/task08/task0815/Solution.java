package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Васил", "Камалов");
        map.put("Vitj", "Tapkin");
        map.put("Куликов", "Иван");
        map.put("Лакшери", "Димо");
        map.put("Капитан", "Немо");
        map.put("Хан", "Чизгиз");
        map.put("ДиКаприо", "Леха");
        map.put("Человек", "Лопата");
        map.put("Ноги", "Руки");
        map.put("Василь", "Камалов");
    return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int a = 0;
        for (String n : map.values()) {
            if (n.equals(name)) {
                a++;
            }
        }
            return a;
        }

        public static int getCountTheSameLastName (HashMap < String, String > map, String lastName){
            int b = 0;
            for (String i : map.keySet()) {
                if (i.equals(lastName)) {
                    b++;
                }
            }
                return b;
            }

            public static void main (String[]args){

            }
        }

