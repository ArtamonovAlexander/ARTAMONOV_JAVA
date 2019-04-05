package ru.home.repositiory;

import ru.home.model.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends Crud<User> {
    List<User> findAll();
    Optional<User> findOneByLogin(String login);
    List<User> findAllByFirstNameAndLastName(String firstName, String lastName);
}
