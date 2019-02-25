package com.company;

import com.company.models.Car;
import com.company.models.User;
import com.company.repositories.CarsRepository;
import com.company.repositories.CarsRepositoryImpl;
import com.company.repositories.UsersRepository;
import com.company.repositories.UsersRepositoryImpl;
import com.company.utils.CarFromConsoleRetriever;
import com.company.utils.IdGenerator;
import com.company.utils.UserFromConsoleRetriever;

public class Main {

        public static void main(String[] args) {
            UserFromConsoleRetriever retriever = new UserFromConsoleRetriever();
            CarFromConsoleRetriever retrieverCar = new CarFromConsoleRetriever();
            IdGenerator idGenerator = new IdGenerator("users_id_sequence.txt");
            UsersRepository usersRepository = new UsersRepositoryImpl("users.txt", idGenerator);
            CarsRepository carsRepository = new CarsRepositoryImpl("cars.txt");
            User user = retriever.retrieveUser();
            usersRepository.save(user);
            User user1 = retriever.retrieveUser();
            usersRepository.save(user1);
            Car car = retrieverCar.retrieveCar();
            carsRepository.save(car);
            Car car1 = retrieverCar.retrieveCar();
            carsRepository.save(car1);
            System.out.println(usersRepository.find(3));
            System.out.println(carsRepository.find(3));
            System.out.println("----------");
            carsRepository.findByOwner(user).print();
        }
    }
