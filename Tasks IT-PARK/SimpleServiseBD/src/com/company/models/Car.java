package com.company.models;

public class Car {
    private String carModel;
    private String numberCar;
    private Long idOwner;
    private Long id;

    public Car(Long id, String carModel, String numberCar, Long idOwner) {
        this.carModel = carModel;
        this.numberCar = numberCar;
        this.idOwner = idOwner;
        this.id = id;
    }
    public Car(String carModel, String numberCar, Long idOwner) {
        this.carModel = carModel;
        this.numberCar = numberCar;
        this.idOwner = idOwner;
    }

    public Long getId() {
        return id;
    }

    public String getNumberCar() {
        return numberCar;
    }

    public String getCarModel() {
        return carModel;
    }

    public Long getIdOwner() {
        return idOwner;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", carModel='" + carModel + '\'' +
                ", numberCar='" + numberCar + '\'' +
                ", idOwner='" + idOwner + '\'' +
                '}';
    }
}
