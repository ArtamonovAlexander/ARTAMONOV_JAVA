package com.javarush.task.ITpark3.parking;

public class Tank extends Transport implements Ride, Shoot{
    public Tank(String name, int gosNumber) {
        super(name, gosNumber);
    }

    @Override
    public void ride() {
        System.out.println(getName() + " тр-тр-тр надвигается..");
    }

    @Override
    public void shoot() {
        System.out.println(getName() + " Делает залп!");
    }
}
