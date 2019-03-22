package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    static Cat cat1 = new Cat();
    static Cat cat2 = new Cat();
    static Cat cat3 = new Cat();
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        cats.remove(cats.toArray()[0]);        //напишите тут ваш код. step 3 - пункт 3

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        HashSet<Cat> cats = new HashSet<>();
        cats.add( cat1 );
        cats.add(cat2);
        cats.add(cat3);

        return cats;
    }

    public static void printCats(Set<Cat> cats) {
       for (Cat cat : cats){
           System.out.println("This is a cat: "+cat);
       }
        // step 4 - пункт 4
    }
    public static class Cat{
        Cat(){}
    }
    // step 1 - пункт 1
    }
