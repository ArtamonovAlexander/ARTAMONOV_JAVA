package com.company.repositories.jdbc;

import com.company.list.ArrayList;
import com.company.list.List;
import com.company.models.Car;
import com.company.repositories.CarsRepository;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CarsRepositoryJdbcImpl implements CarsRepository {

    //language=SQL
    private final static String SQL_SELECT_BY_ID = "select * from car where id = ";
    //language=SQL
    private final static String SQL_SELECT_FIND_BY_OWNER_ID = "select c.id, model, number, owner_id from service_user join car c on service_user.id = c.owner_id where owner_id = ";

    private DataBaseConnector connector;

    public CarsRepositoryJdbcImpl(DataBaseConnector connector) {
        this.connector = connector;
    }

    @Override
    public List<Car> findByOwner(Long id) {
        ArrayList listCar = new ArrayList();
        ResultSet result = connector.executeQuery(SQL_SELECT_FIND_BY_OWNER_ID + id + ";");
        try {
            if (result.next()) {
                listCar.add( new Car(
                        result.getLong("id"),
                        result.getString("model"),
                        result.getString("number"),
                        result.getLong("owner_id")));

            } else return null;
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
        return listCar;
    }

    @Override
    public void save(Car model) {
        //language=sql
        String insertQuery = "insert into car(get.id, get.model, get.number, get.owner_id) " +
                "values ('" + model.getId() + "' + '" + model.getCarModel() + "','" + model.getNumberCar() + "','" + model.getIdOwner() + "');";

        System.out.println("RUN QUERY: " + insertQuery);

        if (!connector.executeUpdate(insertQuery)) {
            throw new IllegalStateException("Some error");
        }
    }

    @Override
    public Car find(Long id) {
        ResultSet result = connector.executeQuery(SQL_SELECT_BY_ID + id + ";");
        try {
            if (result.next()) {
                return new Car(result.getLong("id"),
                        result.getString("model"),
                        result.getString("number"),
                        result.getLong("owner_id"));
            } else return null;
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }


}

