package com.javarush.task.ITpark3.parking;

public class Aircraft extends Transport implements Fly {


    public Aircraft(String name, int gosNumber) {
        super(name, gosNumber);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " прилетел!" );
    }
}
