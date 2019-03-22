package com.javarush.task.task05.task0517;

/*
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст - неизвестные. Кот - бездомный)
- вес, цвет, адрес (чужой домашний кот)
Конструируем котиков
*/

public class Cat {
    String name;
    int weight;
    int age;
    String color;
    String address;

    public Cat(String name){
        this.name = name;
        this.weight = 4;
        this.age = 3;
        this.color = "red";
    }
    public Cat(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "green";
    }
    public Cat(String name, int age){
        this.name = name;
        this.weight = 4;
        this.age = age;
        this.color = "grey";
    }
    public Cat(int weight, String color){
        this.weight = weight;
        this.age = 4;
        this.color = color;
    }
    public Cat(int weight, String color, String address){
        this.weight = weight;
        this.age = 1;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
