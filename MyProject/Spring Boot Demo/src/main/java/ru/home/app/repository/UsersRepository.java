package ru.home.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.home.app.model.User;

import java.util.List;

public interface UsersRepository extends JpaRepository<User, Long> {
    List<User> findAllByNameContainsIgnoreCase(String keyword1);
}
