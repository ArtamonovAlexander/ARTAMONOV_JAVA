package ru.home.repositiory;

import ru.home.model.User;

import java.util.List;
import java.util.Optional;

public interface UsersRepository extends Crud<User> {
    Optional<User> findOneByLogin(String login);
    List<User> findAllByFirstNameAndLastName(String firstName, String lastName);
}
