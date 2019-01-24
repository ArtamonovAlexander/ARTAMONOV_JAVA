package com.javarush.task.ITpark3.parking;

public class Main {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("Самолет", 2);
        Helicopter helicopter = new Helicopter("Велосипед", 13);
        Spaceship spaceship = new Spaceship("Космический корабль", 785242637);
        Tank tank = new Tank("Танк", 27);
        Car car = new Car("Автомобиль", 124);

        Fly flyIN[]= {aircraft, spaceship};
        for (int i = 0; i < flyIN.length; i++) {
            flyIN[i].fly();
        }

        Ride rides[]= {helicopter, tank, car};
        for (int i = 0; i < rides.length; i++) {
            rides[i].ride();
        }

        Shoot shoots[]= {tank, spaceship};
        for (int i = 0; i < shoots.length; i++) {
            shoots[i].shoot();
        }

        Transport transports[]= {aircraft, helicopter, spaceship, tank, car};
        for (int i = 0; i < transports.length; i++) {
            transports[i].parkingByGosNumber();
        }

    }
}
