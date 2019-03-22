package company.repositories.jdbc;

import org.junit.Test;
import company.models.User;
import static org.junit.Assert.*;
import company.repositories.UsersRepository;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.ArrayList;
import java.util.List;

public class UsersRepositoryJdbcTemplateImplTest {

//    public void dataManager() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        dataSource.setUsername("root");
//        dataSource.setPassword("1234");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/test?useSSL=false");
//
//        UsersRepository usersRepository = new UsersRepositoryJdbcTemplateImpl(dataSource);
//    }
//
//    User user = User.builder()
//            .firstName("Муса")
//            .lastName("Джалил")
//            .login("musa777")
//            .password("хаерле ирте")
//            .build();

//        System.out.println(usersRepository.findAll());
//        System.out.println(usersRepository.findOneByLogin("victorq"));
//        System.out.println(usersRepository.findAllByFirstNameAndLastName("Марсель", "Сидиков"));
//        usersRepository.save(user);
//        usersRepository.delete((long) 5);

    @org.junit.Test
    public void save() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUsername("root");
        dataSource.setPassword("1234");
        dataSource.setUrl("jdbc:mysql://localhost:3306/test?useSSL=false");

        UsersRepository usersRepository = new UsersRepositoryJdbcTemplateImpl(dataSource);

        User user = User.builder()
                .firstName("Муса")
                .lastName("Джалил")
                .login("musa777")
                .password("asdgfase332")
                .build();
        usersRepository.save(user);
        User user1 = usersRepository.find(20l);
        user1.setId(user.getId());
        assertEquals(user, user1);
    }


    @org.junit.Test
    public void find() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUsername("root");
        dataSource.setPassword("1234");
        dataSource.setUrl("jdbc:mysql://localhost:3306/test?useSSL=false");

        UsersRepository usersRepository = new UsersRepositoryJdbcTemplateImpl(dataSource);

        User marsel = User.builder()
                .firstName("Марсель")
                .lastName("Сидиков")
                .login("marsel")
                .password("qwerty007")
                .build();

        User user = usersRepository.find(1l);
        marsel.setId(1l);
        assertEquals(marsel, user);
    }



    @org.junit.Test
    public void findAll() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUsername("root");
        dataSource.setPassword("1234");
        dataSource.setUrl("jdbc:mysql://localhost:3306/test?useSSL=false");

        UsersRepository usersRepository = new UsersRepositoryJdbcTemplateImpl(dataSource);

        List<User> userList = usersRepository.findAll();
        int sizeList = userList.size();
        int sizeTable = ((UsersRepositoryJdbcTemplateImpl) usersRepository).size();
        assertEquals(sizeList, sizeTable);
    }

    @org.junit.Test
    public void delete() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUsername("root");
        dataSource.setPassword("1234");
        dataSource.setUrl("jdbc:mysql://localhost:3306/test?useSSL=false");

        UsersRepository usersRepository = new UsersRepositoryJdbcTemplateImpl(dataSource);

        long id = 7;
        usersRepository.delete(id);
        User user = usersRepository.find(id);
        assertEquals(null, user);
    }

    @org.junit.Test
    public void findOneByLogin() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUsername("root");
        dataSource.setPassword("1234");
        dataSource.setUrl("jdbc:mysql://localhost:3306/test?useSSL=false");

        UsersRepository usersRepository = new UsersRepositoryJdbcTemplateImpl(dataSource);
        User user = usersRepository.findOneByLogin("marsel");
        User user1 = usersRepository.find(1l);
        assertEquals(user1, user);
    }

    @org.junit.Test
    public void findAllByFirstNameAndLastName() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUsername("root");
        dataSource.setPassword("1234");
        dataSource.setUrl("jdbc:mysql://localhost:3306/test?useSSL=false");

        UsersRepository usersRepository = new UsersRepositoryJdbcTemplateImpl(dataSource);

        User marsel = User.builder()
                .firstName("Марсель")
                .lastName("Сидиков")
                .login("marsel")
                .password("qwerty007")
                .build();
        List<User> marselList = new ArrayList<>();
        marselList.add(marsel);
        List<User> userList = usersRepository.findAllByFirstNameAndLastName("Марсель", "Сидиков");
        marsel.setId(1l);
        assertEquals(marselList, userList);
    }
}