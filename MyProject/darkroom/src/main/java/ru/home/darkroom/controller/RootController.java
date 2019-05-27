package ru.home.darkroom.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController {
    @GetMapping("/")
    @PreAuthorize("permitAll()")
    public String getRootPage(Authentication authentication) {
        if(authentication != null)
            return "redirect:/guest/search";
        else
            return "redirect:/signIn";
    }
}
