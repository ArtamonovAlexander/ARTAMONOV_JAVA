package ru.home.darkroom.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.home.darkroom.models.Guest;
import ru.home.darkroom.repository.GuestRepository;

import java.util.List;

@Service
public class GuestServiceImpl implements GuestService {
    @Autowired
    private GuestRepository guestRepository;

    @Override
    public List<Guest> getGuests() {
        return guestRepository.findAll();
    }

    @Override
    public void add(Guest guest) {
        guestRepository.save(guest);
    }
}
