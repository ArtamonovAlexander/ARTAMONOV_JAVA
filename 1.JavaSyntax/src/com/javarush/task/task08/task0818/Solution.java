package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("фил", 150);
        map.put("мил",700);
        map.put("кил",657);
        map.put("дил",345);
        map.put("бил",785);
        map.put("жил",1378);
        map.put("рил",894);
        map.put("нил",234);
        map.put("сил",3267);
        map.put("чил",1242);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String, Integer> pair = iterator.next();
            if(pair.getValue() < 500)
                iterator.remove();
        }
        for (Map.Entry<String, Integer> pair1 : map.entrySet())
        {
            String key = pair1.getKey();                      //ключ
            Integer value = pair1.getValue();                  //значение
            System.out.println(key + ":" + value);
        }
    }

    public static void main(String[] args) {

    }
}