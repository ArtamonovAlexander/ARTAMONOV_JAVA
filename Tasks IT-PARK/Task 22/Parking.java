package com.javarush.task.ITpark3.parking;

import java.util.Scanner;

public class Parking extends Transport {
    Scanner scanner = new Scanner(System.in);

    public Parking(String name, int gosNumber) {
        super(name, gosNumber);
    }

    public void parkingByGosNumber() {
        System.out.println(getName() + " c ГосНомером " + getGosNumber() + " припарковался!");
    }

    public void leaveTheParking() {
        System.out.println("Сообщите ваш гос. номер!");
        int number = scanner.nextInt();
        for (int i = 0; i < transports.length; i++) {
            if (number == transports[i].getGosNumber()) {
                System.out.println(getName() + " с номером " + getGosNumber() + " свободен!");
            }
            else System.out.println("Транспортное средство с нормером " + number + " не найдено..");
        }
    }
}