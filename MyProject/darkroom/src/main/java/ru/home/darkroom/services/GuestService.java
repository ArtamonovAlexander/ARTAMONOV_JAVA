package ru.home.darkroom.services;

import ru.home.darkroom.models.Guest;

import java.util.List;

public interface GuestService {
    List<Guest> getGuests();

    void add(Guest guest);

}
