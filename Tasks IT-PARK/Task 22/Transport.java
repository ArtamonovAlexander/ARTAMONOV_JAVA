package com.javarush.task.ITpark3.parking;

public abstract class Transport {
    private String name;
    private int gosNumber;

    public Transport(String name, int gosNumber) {
        this.name = name;
        this.gosNumber = gosNumber;
    }

    public String getName() {
        return name;
    }

    public int getGosNumber() {
        return gosNumber;
    }

    void parkingByGosNumber(){
        System.out.println(getName() + " c ГосНомером " + getGosNumber() + " припарковался!");
    }
}
