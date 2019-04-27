package ru.home.repositiory;

import ru.home.model.Auth;

import java.util.Optional;

public interface AuthRepository extends Crud<Auth> {
    Optional<Auth> findByValue(String value);

}
