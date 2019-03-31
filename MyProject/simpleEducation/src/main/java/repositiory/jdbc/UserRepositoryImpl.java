package repositiory.jdbc;

import model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import repositiory.UserRepository;

import java.util.List;

public class UserRepositoryImpl implements UserRepository {

    //language=sql
    private static final String SQL_SELECT_ALL = "select * from users";
    //language=sql
    private static final String SQL_SAVE = "insert into users (first_name, last_name, login, password_hash) values (?, ?, ?, ?)";
    //language=sql
    private static final String SQL_SELECT_ID = "select * from users where id = ?";


    private JdbcTemplate jdbcTemplate;


    public static RowMapper<User> rowMapper = (row, aaa)->{
        return User.builder()
                .id(row.getLong("id"))
                .first_name(row.getString("first_name"))
                .last_name(row.getString("last_name"))
                .login(row.getString("login"))
                .password_hash(row.getString("password_hash"))
                .build();
    };


    public UserRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public List<User> findAll() {
        return jdbcTemplate.query(SQL_SELECT_ALL, rowMapper);
    }

    public void save(User user) {
        jdbcTemplate.update(SQL_SAVE, user.getFirst_name(), user.getLast_name(), user.getLogin(), user.getPassword_hash());
    }

    public User find(Long id) {
        return jdbcTemplate.queryForObject(SQL_SELECT_ID, rowMapper, id);
    }

    public void delete(Long id) {

    }
}
