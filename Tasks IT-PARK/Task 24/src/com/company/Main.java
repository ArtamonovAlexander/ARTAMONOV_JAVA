package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        IntegerLinkedList list = new IntegerLinkedList();
        LinkedList list2 = new LinkedList();


        list.addToBegin(1);
        list.addToBegin(2);
        list.addToBegin(3);
        list.addToBegin(4);
        list.addToBegin(5);

        list.addToEnd(6);
        list.addToEnd(7);
        list.addToEnd(8);
        list.addToEnd(9);
        list.addToEnd(10);

        list.print();

        list.insert(99, 4);

        list.print();

        list.reverse();

        list.print();
        System.out.println(list.contains(8));
        System.out.println(list.indexOf(10));
        System.out.println(list.get(3));
        list.remove(0);
        list.print();


    }
}
