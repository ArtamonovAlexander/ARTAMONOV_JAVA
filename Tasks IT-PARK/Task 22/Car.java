package com.javarush.task.ITpark3.parking;

public class Car extends Transport implements Ride {

    public Car(String name, int gosNumber) {
        super(name, gosNumber);
    }

    @Override
    public void ride() {
        System.out.println(getName() + " мчится к парковке.");
    }
}
