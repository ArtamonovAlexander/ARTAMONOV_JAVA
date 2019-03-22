package com.javarush.task.task07.task0707;

import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Витя");
        list.add("Vитя");
        list.add("Dитя");
        list.add("Fитя");
        list.add("Sитя");
        System.out.println(list.size());

        for (int i = 0; i < 5 ; i++) {
            System.out.println(list.get(i));
        }
    }
}
