package ru.home.app.services;

import ru.home.app.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsers(Boolean sort, String by, Boolean desc);
    List<User> getUserWuthSearch(String query);
}
