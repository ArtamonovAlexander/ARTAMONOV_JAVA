package com.javarush.task.ITpark3.television;

public class Program {
    private String name;

    public Program(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void printName() {
        System.out.println(name);
    }
}
