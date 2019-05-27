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

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Controller
@RequestMapping(value = "/guest")
public class GuestController {
    @Autowired
    private GuestService guestService;

    @GetMapping
    @PreAuthorize("permitAll()")
    public String getGuestPage(){
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
    public List<Guest> getUsersByKeyword(@RequestParam(value = "q", required=false) String query,
                                         @RequestParam(value = "t", required = false) String type) {
        if (type != null && !type.isEmpty() && type.equals("Date")) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate ld = LocalDate.parse(query, formatter);
            return guestService.getUsersWithSearchByDate(ld);
        } else {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");
            LocalDateTime ldt = LocalDateTime.parse(query, formatter);
            return guestService.getUsersWithSearch(ldt);
        }
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public String getById(@PathVariable("id") Long id, Model model){
        model.addAttribute("guestData", guestService.getById(id));
        return "showGuest";
    }

    @GetMapping("/delete/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public String deleteGuest(@PathVariable("id") Long id){
        guestService.delete(id);
        return "redirect:/guest";
    }

    @PostMapping("/showGuest")
    @PreAuthorize("hasAuthority('ADMIN')")
    public String updateGuest (@RequestParam("id") Long id,
                               @ModelAttribute("guest") GuestForm guestForm){
        guestService.add(guestForm);
        guestService.delete(id);
        return "redirect:/guest";
    }

    @GetMapping("/list")
    @PreAuthorize("hasAuthority('ADMIN')")
    public String getListPage(ModelMap model) {
        List<Guest> guests = guestService.getGuests();
        model.addAttribute("guests", guests);
        return "list";
    }
}