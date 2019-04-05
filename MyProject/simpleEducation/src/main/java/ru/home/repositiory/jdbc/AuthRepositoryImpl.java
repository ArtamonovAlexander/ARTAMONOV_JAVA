package ru.home.repositiory.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Component;
import ru.home.model.Auth;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import ru.home.repositiory.AuthRepository;

import java.util.Optional;

@Component
public class AuthRepositoryImpl implements AuthRepository {

    //language=sql
    private static final String SQL_INSERT = "insert into auth (user_id, cookie_value) VALUES (?, ?)";

    private static final String SQL_SELECT_VALUE = "SELECT * auth WHERE value = ?";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private RowMapper<Auth> authRowMapper = (row, rowNumber) -> {
        Auth auth = Auth.builder()
                .id(row.getLong("id"))
                .value(row.getString("cookie_value"))
                .build();
        return auth;
    };


    @Override
    public void save(Auth auth) {
        jdbcTemplate.update(SQL_INSERT, auth.getId(), auth.getValue());
    }

    @Override
    public Auth find(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Optional<Auth> findByValue(String value) {
        try {
            return Optional.of(jdbcTemplate.queryForObject(SQL_SELECT_VALUE, authRowMapper, value));
        } catch (EmptyResultDataAccessException e) {
            return Optional.empty();
        }
    }
}
