package ru.home.darkroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.home.darkroom.models.Guest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface GuestRepository extends JpaRepository <Guest, Long> {
    List<Guest> findAllByDateSeance(LocalDateTime query);
    Guest findAllById(Long id);
    void deleteById(Long id);
    List<Guest> findAllByDateSeance(LocalDate ld);
}
