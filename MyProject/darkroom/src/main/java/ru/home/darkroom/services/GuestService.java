package ru.home.darkroom.services;

import ru.home.darkroom.form.GuestForm;
import ru.home.darkroom.models.Guest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface GuestService {
    List<Guest> getGuests();
    void add(GuestForm guestForm);
    List<Guest> getUsersWithSearch(LocalDateTime query);
    Guest getById(Long id);
    void delete(Long id);

    List<Guest> getUsersWithSearchByDate(LocalDate ld);
}
