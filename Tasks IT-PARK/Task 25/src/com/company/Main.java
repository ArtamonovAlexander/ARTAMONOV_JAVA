package com.company;

public class Main {

    public static void main(String[] args) {
        GenericArrayList<Integer> integerList = new GenericArrayList<>();
        integerList.add(6);
        integerList.add(7);
        integerList.add(8);
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        GenericArrayList<String> stringList = new GenericArrayList<>();
        stringList.add("Marsel");
        stringList.add("Hello");
        stringList.add("Happy Birthday");

        GenericLinkedList<Integer> intLink = new GenericLinkedList<>();
        intLink.add(6);
        intLink.add(7);
        intLink.add(8);
        intLink.add(1);
        intLink.add(2);
        intLink.add(3);

        int integerValue = integerList.get(2);
        String stringValue = stringList.get(1);
        int intVal = intLink.get(1);
        System.out.println(intVal);
        System.out.println(integerValue);
        System.out.println(stringValue);
        intLink.print();

        intLink.reverse();
        intLink.addToBegin(7);

        System.out.println(intLink.indexOf(3));
        intLink.insert(5, 4);
        intLink.print();
        intLink.remove(2);
        intLink.print();

        integerList.print();
        integerList.remove(2);
        integerList.print();

    }
}
