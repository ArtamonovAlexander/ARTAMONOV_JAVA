package ru.home.repositiory.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import ru.home.model.Car;
import ru.home.repositiory.UsersCar;

import java.util.List;

@Component
public class UsersCarImpl implements UsersCar {

    //language=sql
    private static final String SQL_INSERT = "insert into car (nameUser, model, number) VALUES (?, ?, ?)";
    //language=sql
    private static final String SQL_SELECT_ALL = "SELECT * FROM car";

    @Autowired
    JdbcTemplate jdbcTemplate;

    RowMapper<Car> carRowMapper = (row, rowMapper) -> {
        return Car.builder()
                .id(row.getLong("id"))
                .nameUser(row.getString("nameUser"))
                .model(row.getString("model"))
                .number(row.getString("number"))
                .build();
    };

    @Override
    public void save(Car car) {
        jdbcTemplate.update(SQL_INSERT, car.getNameUser(), car.getModel(), car.getNumber());
    }

    @Override
    public List<Car> findAll() {
        return jdbcTemplate.query(SQL_SELECT_ALL, carRowMapper);
    }

    @Override
    public Car find(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
