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
    public int printNumberIn() {
        System.out.println(getName() + " c номером " + gosNumber + " припарковался!");
        return gosNumber;
    }
    public int printNumberOut() {
        System.out.println(getName() + " c номером " + gosNumber + " выезжает!");
        return gosNumber;
    }
    void onPark(Parking parking){
        parking.onParking(this);
    }
    void outPark(Parking parking){
        parking.outParking(this, this.getGosNumber());
    }
}
