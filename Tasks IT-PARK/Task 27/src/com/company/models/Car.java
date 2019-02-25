package com.company.models;

public class Car {
    private String carModel;
    private String numberCar;
    private String idOwner;

    public Car(String carModel, String numberCar, String idOwner) {
        this.carModel = carModel;
        this.numberCar = numberCar;
        this.idOwner = idOwner;
    }

    public String getNumberCar() {
        return numberCar;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getIdOwner() {
        return idOwner;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                ", numberCar='" + numberCar + '\'' +
                ", idOwner='" + idOwner + '\'' +
                '}';
    }
}
