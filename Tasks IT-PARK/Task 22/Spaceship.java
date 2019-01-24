package com.javarush.task.ITpark3.parking;

public class Spaceship extends Transport implements Shoot, Fly {

    public Spaceship(String name, int gosNumber) {
        super(name, gosNumber);
    }

    @Override
    public void shoot() {
        System.out.println(getName() + " Делает: Пиу - пиу - пиу");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " вжух и появился!!!");
    }
}
