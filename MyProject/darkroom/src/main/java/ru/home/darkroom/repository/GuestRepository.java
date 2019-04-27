package ru.home.darkroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.home.darkroom.models.Guest;

import java.util.Optional;

public interface GuestRepository extends JpaRepository <Guest, Long> {
}
