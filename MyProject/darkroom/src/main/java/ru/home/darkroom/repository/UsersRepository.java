package ru.home.darkroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.home.darkroom.models.User;

import java.util.Optional;

public interface UsersRepository extends JpaRepository <User, Long> {
    Optional<User> findFirstByLoginIgnoreCase(String login);
}
