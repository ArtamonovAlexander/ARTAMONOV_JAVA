package ru.home.darkroom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.home.darkroom.models.Guest;
import ru.home.darkroom.services.GuestService;

import java.util.List;

@Controller
@RequestMapping(value = "/guest")
public class GuestController {
    @Autowired
    private GuestService guestService;

    @GetMapping
    @PreAuthorize("permitAll()")
    public String getGuestPage(ModelMap model){
        List<Guest> guests = guestService.getGuests();
        model.addAttribute("guests", guests);
        return "guest";
    }

    @PostMapping
    @PreAuthorize("permitAll()")
    public String addGuest (Guest guest){
        guestService.add(guest);
        return "redirect:/guest";
    }
}
