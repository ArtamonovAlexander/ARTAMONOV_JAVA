package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        Date dataNow = new Date();
        SimpleDateFormat formatForData = new SimpleDateFormat("dd MM yyyy");
        System.out.println(formatForData.format(dataNow));
    }
}
