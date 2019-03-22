package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Silva", df.parse("MARCH 2 1980"));
        map.put("Sirenna", df.parse("AUGUST 1 1986"));
        map.put("Suleiman", df.parse("JUNE 1 1980"));
        map.put("SiSi", df.parse("JUNE 1 1980"));
        map.put("Salo", df.parse("MAY 1 1980"));
        map.put("Sony", df.parse("OCTOBER 1 1980"));
        map.put("Serries", df.parse("JUNE 1 1980"));
        map.put("Slivka", df.parse("APRIL 1 1980"));
        map.put("Samuell", df.parse("JUNE 1 1980"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
            Iterator<Map.Entry<String, Date>> itr = map.entrySet().iterator();
                while(itr.hasNext()) {
                    HashMap.Entry<String, Date> pair = itr.next();
                    if(pair.getValue().getMonth() >= 5 && pair.getValue().getMonth() <= 7)
                        itr.remove();
                }

    }

    public static void main(String[] args) {

    }
}
