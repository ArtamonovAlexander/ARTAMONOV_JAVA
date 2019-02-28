package com.company.repositories;

import com.company.list.ArrayList;
import com.company.list.List;
import com.company.models.Car;
import com.company.models.User;

import java.io.*;

public class CarsRepositoryImpl implements CarsRepository {
    private String fileName;

    public CarsRepositoryImpl(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void save(Car model) {
        try {
            FileWriter fileWriter = new FileWriter(fileName, true);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.write(model.getCarModel() + " " + model.getNumberCar() + " " + model.getIdOwner());
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override
    public Car find(Long id) {
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(fileReader);
            String currentLine = reader.readLine();
            while (currentLine != null) {
                String userData[] = currentLine.split(" ");
                Long currentId = Long.parseLong(userData[2]);
                if (currentId == id) {
                    Car car = new Car(userData[0], userData[1], userData[2]);
//                    user.setId(currentId);
                    return car;
                }
                currentLine = reader.readLine();
            }
            return null;
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override
    public List<Car> findByOwner(User owner) {
        try {
            ArrayList listCar = new ArrayList();
            FileReader fileReader = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(fileReader);
            String currentLine = reader.readLine();
            while (currentLine != null) {
                String userData[] = currentLine.split(" ");
                int currentId = Integer.parseInt(userData[2]);
                if (currentId == owner.getId()) {
                    Car car = new Car(userData[0], userData[1], userData[2]);
                    listCar.add(car);
                }
                currentLine = reader.readLine();
            }
            return listCar;
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
