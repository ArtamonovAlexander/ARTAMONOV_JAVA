package com.company.repositories;

import com.company.list.List;
import com.company.models.Car;
import com.company.models.User;

public interface CarsRepository extends CrudRepository<Car> {
    List<Car> findByOwner(User owner);
}
