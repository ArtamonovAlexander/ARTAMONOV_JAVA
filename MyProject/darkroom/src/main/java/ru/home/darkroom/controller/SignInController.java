package ru.home.darkroom.controller;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/signIn")
public class SignInController {
    @GetMapping
    @PreAuthorize("permitAll()")
    public String getSignInPage() {
        return "signIn";
    }
}
