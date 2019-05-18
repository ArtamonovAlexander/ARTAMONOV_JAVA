package ru.home.darkroom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.home.darkroom.form.GuestForm;
import ru.home.darkroom.models.Guest;
import ru.home.darkroom.services.GuestService;

import java.time.LocalDateTime;
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
    public String addGuest (GuestForm guestForm){
        guestService.add(guestForm);
        return "redirect:/guest";
    }

    @GetMapping("/search")
    @PreAuthorize("permitAll()")
    public String getSearchPage() {
        return "search";
    }

    @GetMapping("/search.json")
    @PreAuthorize("permitAll()")
    @ResponseBody
    public List<Guest> getUsersByKeyword(@RequestParam("q") LocalDateTime query) {
        return guestService.getUsersWithSearch(query);
    }

    @GetMapping("/{id}")
    public String getById(@PathVariable("id") Long id, Model model){
        model.addAttribute("guestData", guestService.getById(id));
        return "showGuest";
    }

    @GetMapping("/delete/{id}")
    public String deleteGuest(@PathVariable("id") Long id){
        guestService.delete(id);
        return "redirect:/guest";
    }

    @PostMapping("/showGuest")
    @PreAuthorize("permitAll()")
    public String updateGuest (@RequestParam("id") Long id,
                               @ModelAttribute("guest") GuestForm guestForm){
        guestService.add(guestForm);
        guestService.delete(id);
        return "redirect:/guest";
    }
//
//    @GetMapping("/update/{id}")
//    public String update(@PathVariable("id") int id, Model model){
//        model.addAttribute("guest", guestService.getById(id));
//        return "redirect:/showGuest";
//    }
}
