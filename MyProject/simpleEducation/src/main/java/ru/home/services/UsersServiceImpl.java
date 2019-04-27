package ru.home.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.home.form.UserForm;
import ru.home.model.User;
import ru.home.repositiory.UsersRepository;

import java.util.List;

@Component
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersRepository usersRepository;


    @Override
    public List<User> getAllUsers() {
        return usersRepository.findAll();
    }

    @Override
    public void addUser(UserForm form) {
        User user = User.builder()
                .firstName(form.getFirstName())
                .lastName(form.getLastName())
                .build();

        usersRepository.save(user);
    }
}
