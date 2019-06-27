package ru.testwork;

import java.util.concurrent.locks.ReentrantLock;

public class Valet {

    private Park park;

    public Valet(Park park) {
        this.park = park;
    }

    static ReentrantLock lock = new ReentrantLock();


    synchronized void parkInCar(Transport transport) {
        lock.lock();
        try {
            for (int i = 0; i < park.getCarList().length; i++) {
                if (park.getCarList()[i] == null) {
                    park.getCarList()[i] = transport;
                    System.out.println("Car parked");
                    break;
                } else if (i == park.getCarList().length - 1) {
                    System.err.println("Parking CAR is full");
                }
            }
        } finally {
            lock.unlock();
        }
    }

    synchronized void moveOutCar(Transport transport) {
        lock.lock();
        try {
            for (int i = 0; i < park.getCarList().length; i++) {
                if (park.getCarList()[i] != null) {
                    park.getCarList()[i] = null;
                    System.out.println("The CAR left the Parking lot");
                    break;
                } else if (i == park.getCarList().length - 1) {
                    System.err.println("Parking CAR is Empty..");
                }
            }
        } finally {
            lock.unlock();
        }
    }

    synchronized void parkInTruck(Transport transport) {
        lock.lock();
        try {
            for (int i = 0; i < park.getTruckList().length; i++) {
                if (park.getTruckList()[i] == null) {
                    park.getTruckList()[i] = transport;
                    System.out.println("Truck parked");
                    break;
                }
                if (park.getPlaceCar() >= 2 && i == park.getTruckList().length - 1) {
                    for (int j = 0; j < park.getCarList().length; j++) {
                        if (j < park.getCarList().length - 1 && park.getCarList()[j] == null && park.getCarList()[j + 1] == null) {
                            park.getCarList()[j] = transport;
                            park.getCarList()[j + 1] = transport;
                            System.out.println("Truck parked in CAR parking");
                            break;
                        } else if (j == park.getTruckList().length - 1) {
                            System.err.println("Parking TRUCK and CAR is Full..");
                        }
                    }
                }
            }
        } finally {
            lock.unlock();
        }
    }

    synchronized void moveOutTruck(Transport transport) {
        lock.lock();
        try {
            for (int i = 0; i < park.getTruckList().length; i++) {
                if (park.getTruckList()[i] != null) {
                    park.getTruckList()[i] = null;
                    System.out.println("The TRUCK left the Parking lot");
                    break;
                }
                if (park.getPlaceCar() >= 2 && i == park.getTruckList().length - 1) {
                    for (int j = 0; j < park.getCarList().length; j++) {
                        if (j < park.getCarList().length - 1 && park.getCarList()[j] instanceof Truck && park.getCarList()[j + 1] instanceof Truck) {
                            park.getCarList()[j] = null;
                            park.getCarList()[j + 1] = null;
                            System.out.println("The TRUCK left the Parking lot Cars");
                            break;
                        } else if (j == park.getTruckList().length - 1) {
                            System.err.println("Parking TRUCK and CAR is Empty");
                        }
                    }
                }
            }
        } finally {
            lock.unlock();
        }
    }
}
