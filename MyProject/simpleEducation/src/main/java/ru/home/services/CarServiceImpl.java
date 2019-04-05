package ru.home.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.home.form.CarForm;
import ru.home.model.Car;
import ru.home.repositiory.UsersCar;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    @Autowired
    private UsersCar usersCar;

    @Override
    public List<Car> getAllCar() {
        return usersCar.findAll();
    }

    @Override
    public void addCar(CarForm form) {
        Car car = Car.builder()
                .nameUser(form.getNameUser())
                .model(form.getModel())
                .number(form.getNumber())
                .build();
        usersCar.save(car);
    }
}
