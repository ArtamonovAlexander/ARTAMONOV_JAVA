package ru.home.services;

import ru.home.form.AuthUserForm;
import ru.home.form.UserForm;
import ru.home.model.User;

import java.util.List;
import java.util.Optional;

public interface UsersService {
    List<User> getAllUsers();
    void addUser(UserForm form);
}
