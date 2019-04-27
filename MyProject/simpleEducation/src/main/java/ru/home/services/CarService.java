package ru.home.services;

import ru.home.form.CarForm;
import ru.home.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getAllCar();

    void addCar(CarForm form);
}
