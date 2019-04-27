package ru.home.darkroom.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.home.darkroom.models.Guest;
import ru.home.darkroom.models.User;
import ru.home.darkroom.security.UserDetailsImpl;

@Controller
@RequestMapping("/profile")
public class ProfileController {
    @GetMapping
    @PreAuthorize("isAuthenticated()")
    public String getProfilePage(Authentication authentication, ModelMap model) {
        UserDetailsImpl userDetails = (UserDetailsImpl)authentication.getPrincipal();
        User user = userDetails.getUser();
        model.addAttribute("user", user);
        return "profile";
    }
}
