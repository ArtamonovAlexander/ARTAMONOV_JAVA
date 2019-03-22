package company.repositories.jdbc;

import company.models.User;
import company.repositories.UsersRepository;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.List;


public class UsersRepositoryJdbcTemplateImpl implements UsersRepository {

    //language=SQL
    private final static String SQL_SELECT_BY_ID = "select * from service_user where id = ?";
    //language=SQL
    private final static String SQL_SELECT_BY_LOGIN = "select * from service_user where login = ?";
    //language=SQL
    private final static String SQL_SELECT_ALL_BY_FIRST_NAME_AND_LAST_NAME = "select * from service_user " + "where first_name = ? and last_name = ?";
    //language=SQL
    private final static String SQL_SELECT_ALL = "select * from service_user";
    //language=SQL
    private final static String SQL_INSERT = "insert into service_user(first_name, last_name, login, password) " + "values (?, ?, ?, ?)";
    //language=SQL
    private final static String SQL_DELETE = "delete from service_user where id = ?";
    //language=SQL
    private final static String SQL_SIZE = "SELECT COUNT(*) FROM service_user";
    //language=sql
    private final static String SQL = "select * from service_user ";


    private JdbcTemplate jdbcTemplate;

    public UsersRepositoryJdbcTemplateImpl(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    private RowMapper<User> usersRowMapper = (row, rowNumber) ->
            User.builder().id(row.getLong("id"))
                    .firstName(row.getString("first_name"))
                    .lastName(row.getString("last_name"))
                    .login(row.getString("login"))
                    .password(row.getString("password"))
                    .build();

    @Override
    public void save(User model) {
        jdbcTemplate.update(SQL_INSERT, model.getFirstName(), model.getLastName(), model.getLogin(), model.getPassword());
    }

//    @Override
    public int size() {
       SqlRowSet a = jdbcTemplate.queryForRowSet(SQL);
       a.last();
       return a.getRow();
    }

    @Override
    public User find(Long id) {
        try {
            return jdbcTemplate.queryForObject(SQL_SELECT_BY_ID, usersRowMapper, id);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    @Override
    public List<User> findAll() {
        return jdbcTemplate.query(SQL_SELECT_ALL, usersRowMapper);
    }

    @Override
    public void delete(Long id) {
         jdbcTemplate.update(SQL_DELETE, id);
    }

    @Override
    public User findOneByLogin(String login) {
        try {
            return jdbcTemplate.queryForObject(SQL_SELECT_BY_LOGIN, usersRowMapper, login);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    @Override
    public List<User> findAllByFirstNameAndLastName(String firstName, String lastName) {
        return jdbcTemplate.query(SQL_SELECT_ALL_BY_FIRST_NAME_AND_LAST_NAME, usersRowMapper, firstName, lastName);
    }
}