package ru.home.darkroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.home.darkroom.models.Guest;

import java.time.LocalDateTime;
import java.util.List;

public interface GuestRepository extends JpaRepository <Guest, Long> {
    List<Guest> findAllByDateSeance(LocalDateTime query);
}
