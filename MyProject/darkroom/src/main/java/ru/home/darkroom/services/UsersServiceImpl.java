package ru.home.darkroom.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.home.darkroom.models.User;
import ru.home.darkroom.repository.UsersRepository;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
        public List<User> getUsers() {
            return usersRepository.findAll();
    }
}
