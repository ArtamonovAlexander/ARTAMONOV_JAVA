package com.javarush.task.ITpark3.parking;

public abstract class Transport {
    private String name;
    private int gosNumber;
//    private int seatNumber;
//
//    public int getSeatNumber() {
//        return seatNumber;
//    }
//
//    public void setSeatNumber(int seatNumber) {
//        this.seatNumber = seatNumber;
//    }

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







//    void parkingByGosNumber(){
//        System.out.println(getName() + " c ГосНомером " + getGosNumber() + " припарковался!");
//    }
}
