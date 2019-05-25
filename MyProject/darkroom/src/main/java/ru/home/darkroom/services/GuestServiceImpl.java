package ru.home.darkroom.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.home.darkroom.form.GuestForm;
import ru.home.darkroom.models.Guest;
import ru.home.darkroom.repository.GuestRepository;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class GuestServiceImpl implements GuestService {

    @Autowired
    private GuestRepository guestRepository;

    @Override
    public void add(GuestForm guestForm) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd,HH:mm");
        LocalDateTime ldt = LocalDateTime.parse(guestForm.getDateSeance(), formatter);

        Guest guest = Guest.builder()
                .age(guestForm.getAge())
                .name(guestForm.getName())
                .gender(guestForm.getGender())
                .number(guestForm.getNumber())
                .dateSeance(ldt)
                .build();
        guestRepository.save(guest);
    }

    @Override
    public List<Guest> getGuests() {
        return guestRepository.findAll();
    }

    @Override
    public List<Guest> getUsersWithSearch(LocalDateTime query) {

        return guestRepository.findAllByDateSeance(query);
    }

    @Override
    public Guest getById(Long id) {
        return guestRepository.findAllById(id);
    }

    @Override
    public void delete(Long id) {
    guestRepository.deleteById(id);
    }

}
