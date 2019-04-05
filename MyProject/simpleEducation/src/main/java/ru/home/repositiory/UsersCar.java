package ru.home.repositiory;

import ru.home.model.Car;

import java.util.List;

public interface UsersCar extends Crud<Car> {
    List<Car> findAll();
}
