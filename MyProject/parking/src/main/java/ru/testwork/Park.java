package ru.testwork;

public class Park {
    private volatile int placeCar;
    private volatile int placeTruck;
    public volatile Transport[] carList;
    public volatile Transport[] trackList;

    public Park(int placeCar, int placeTruck) {
        this.placeCar = placeCar;
        this.placeTruck = placeTruck;
        carList = new Transport[placeCar];
        trackList = new Transport[placeTruck];
    }

    public Transport[] getCarList() {
        return carList;
    }

    public Transport[] getTruckList() {
        return trackList;
    }

    int getPlaceCar() {
        return placeCar;
    }
}
