package ru.home.darkroom.services;

import ru.home.darkroom.models.Guest;

import java.time.LocalDateTime;
import java.util.List;

public interface GuestService {
    List<Guest> getGuests();
    void add(Guest guest);

    List<Guest> getUsersWithSearch(LocalDateTime query);
}
