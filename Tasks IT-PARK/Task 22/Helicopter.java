package com.javarush.task.ITpark3.parking;

public class Helicopter extends Transport implements Ride {

    public Helicopter(String name, int gosNumber) {
        super(name, gosNumber);
    }

    @Override
    public void ride() {
        System.out.println(getName() + " прикатил!");
    }
}
