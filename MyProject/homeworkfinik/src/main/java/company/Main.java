package company;

import company.models.User;
import company.repositories.UsersRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        UsersRepository usersRepository = context.getBean(UsersRepository.class);

        User user = User.builder()
                .firstName("Муса")
                .lastName("Джалил")
                .login("musa777")
                .password("хаерле ирте")
                .build();

        System.out.println(usersRepository.findAll());
        System.out.println(usersRepository.findOneByLogin("victorq"));
        System.out.println(usersRepository.findAllByFirstNameAndLastName("Марсель", "Сидиков"));
        usersRepository.save(user);

    }
}