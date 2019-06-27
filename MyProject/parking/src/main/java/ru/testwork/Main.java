package ru.testwork;

import java.util.Random;
import java.util.Scanner;

public class Main extends Thread {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите колличество парковочных мест для легковых автомобилей.");
//        int placeCars = sc.nextInt();
//        System.out.println("Введите колличество парковочных мест для грузовых автомобилей.");
//        int placeTrucks = sc.nextInt();

        Park park = new Park(2, 2);
        Valet valet = new Valet(park);

        for (int i = 0; i < 5; i++) {
            Transport transportTruck = new Truck(random.nextInt(1000));
            Transport transportCar = new Car(random.nextInt(1000));
            TransportQueueParkIn parkInTruck = new TransportQueueParkIn(transportTruck, valet);
            TransportQueueParkIn parkInCar = new TransportQueueParkIn(transportCar, valet);
            parkInTruck.start();
            parkInCar.start();
        }

        for (int i = 0; i < 2; i++) {
            Transport transportTruck = new Truck(random.nextInt(1000));
            Transport transportCar = new Car(random.nextInt(1000));
            TransportMoveOut moveOutTruck = new TransportMoveOut(transportTruck, valet);
            TransportMoveOut moveOutCar = new TransportMoveOut(transportCar, valet);
            moveOutTruck.start();
            moveOutCar.start();
        }
    }
}
