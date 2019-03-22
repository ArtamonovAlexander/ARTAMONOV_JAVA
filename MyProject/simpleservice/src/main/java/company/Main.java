package company;

import company.models.User;
import company.repositories.CrudRepository;
import company.repositories.UsersRepository;
import company.repositories.jdbc.UsersRepositoryJdbcTemplateImpl;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Main {
    public static void main(String[] args) {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        dataSource.setUsername("root");
//        dataSource.setPassword("1234");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/test?useSSL=false");
//
//        UsersRepository usersRepository
//                = new UsersRepositoryJdbcTemplateImpl(dataSource);
//
//        User user = User.builder()
//                .firstName("Муса")
//                .lastName("Джалил")
//                .login("musa777")
//                .password("хаерле ирте")
//                .build();
//
//        System.out.println(usersRepository.findAll());
//        System.out.println(usersRepository.findOneByLogin("victorq"));
//        System.out.println(usersRepository.findAllByFirstNameAndLastName("Марсель", "Сидиков"));
//        usersRepository.save(user);
//        usersRepository.delete((long) 5);
//        System.out.println(user.getId());

//        System.out.println(((UsersRepositoryJdbcTemplateImpl) usersRepository).size());




    }
}
