package ru.home.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import ru.home.app.model.User;
import ru.home.app.repository.UsersRepository;

import java.util.List;

public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersRepository usersRepository;

    @Override
    public List<User> getUsers(Boolean sort, String by, Boolean desc) {
        if(!sort)
            return  usersRepository.findAll();
        else {by !=
        return null;
    }

    @Override
    public List<User> getUserWuthSearch(String query) {
        return null;
    }
}
