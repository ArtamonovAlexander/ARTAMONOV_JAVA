package com.company.utils;

import com.company.models.Car;

import java.util.Scanner;

public class CarFromConsoleRetriever {

    private Scanner scanner;

    public CarFromConsoleRetriever() {
        this.scanner = new Scanner(System.in);
    }

    public Car retrieveCar() {
        System.out.println("Вводим данные автомобиля!");
        System.out.print("Введи Модель: ");
        String carModel = scanner.nextLine();
        System.out.print("Номер авто: ");
        String numberCar = scanner.nextLine();
        System.out.print("ID Владельца: ");
        String idOwner = scanner.nextLine();

        return new Car(carModel, numberCar, idOwner);
    }
}