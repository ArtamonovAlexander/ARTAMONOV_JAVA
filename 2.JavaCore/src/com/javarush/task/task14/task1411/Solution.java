package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
      //  ArrayList<String> list = new ArrayList<>();

        //тут цикл по чтению ключей, пункт 1
        while (true) {
            key = reader.readLine();
      //      list.add(key);

           if (key.equals("user")) {
                person = new Person.User();
                doWork(person);
            }
            else if (key.equals("loser")) {
                person = new Person.Loser();
                doWork(person);
            }
            else if (key.equals("coder")) {
                person = new Person.Coder();
                doWork(person);
            }
            else if (key.equals("proger")) {
                person = new Person.Proger();
                doWork(person);
            }
          else break;
        }
  /*      for (String name:list) {
            if (name.equals("user")) {
                person = new Person.User();
                doWork(person);
            }
            else if (name.equals("loser")) {
                person = new Person.Loser();
                doWork(person);
            }
            else if (name.equals("coder")) {
                person = new Person.Coder();
                doWork(person);
            }
            else if (name.equals("proger")) {
                person = new Person.Proger();
                doWork(person);
            }
        }*/
    }



    public static void doWork(Person person) {
        // пункт 3
        if (person instanceof Person.User) ((Person.User) person).live();
        if (person instanceof Person.Loser) ((Person.Loser) person).doNothing();
        if (person instanceof Person.Coder) ((Person.Coder) person).writeCode();
        if (person instanceof Person.Proger) ((Person.Proger) person).enjoy();
    }
}
