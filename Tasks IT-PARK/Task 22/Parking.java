package com.javarush.task.ITpark3.parking;

public class Parking {
    private Transport transports[];
    private int transportCount;
    private int MAX_NUMBER_SEAT = 5;

    public Parking() {
        transports = new Transport[MAX_NUMBER_SEAT];
    }
    public void onParking(Transport transport) {
        transport.printNumberIn();
        transports[transportCount] = transport;
        transportCount++;
    }
    public void outParking(Transport transport) {
        transport.printNumberOut();
    }

//    public Parking(int numberCount) {
//    parkingSeats = new ParkingSeat[numberCount];
//    }
//
//    public void parkingByGosNumber(String name, int gosNumber, int numberParking) {
//        parkingSeats[numberParking] = new ParkingSeat(name, gosNumber);
//        System.out.println(name + " c ГосНомером " + gosNumber + " припарковался!");
//    }
//
//    public void leaveTheParking(int numberParking) {
//        if (numberParking >= 0 && numberParking < parkingSeats.length && parkingSeats[numberParking] != null){
//            System.out.println(parkingSeats[numberParking].name + " с номером " + parkingSeats[numberParking].gosNumber + " свободен!");
//            parkingSeats[numberParking] = null;
//        }
//        else System.out.println(" Такого места нет");
//    }
//
//    class ParkingSeat{
//        String name;
//        int gosNumber;
//
//        public ParkingSeat(String name, int gosNumber) {
//            this.name = name;
//            this.gosNumber = gosNumber;
//        }
//
//    }
}