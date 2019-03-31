import model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import repositiory.UserRepository;

public class Main {

    public static void main(String[] args) {

        User user = User.builder()
                .first_name("Igorjan")
                .last_name("Derezhabl")
                .login("igigi")
                .build();

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
        UserRepository userRepository = applicationContext.getBean(UserRepository.class);
//        userRepository.save(user);
    }
}
