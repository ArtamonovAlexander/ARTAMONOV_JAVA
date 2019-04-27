package ru.home.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.home.app.model.User;
import ru.home.app.services.UsersService;

import java.util.List;


@Controller
public class UsersController {
    @Autowired
    private UsersService usersService;

    @GetMapping("/users")
    public String getUsersPage(@RequestParam(value = "sort", required = false), Boolean sort,
                               @RequestParam(value = "by", required = false) String by,
                               @RequestParam(value = "desc", required = false) Boolean desc,
                               ModelMap model) {
        List<User> users = usersService.getUsers(sort, by, desc);
        model.addAttribute("users", users);
        return "users";
    }

    @GetMapping("/users/search")
    public String getSearchPage() {
        return "users_search";
    }

    @GetMapping("/search")
    @ResponseBody
    public List<User> getUsersBeKeyword(@RequestParam("q") String query) {
        return usersRepository.findAllByNameContainsIgnoreCase(query);
    }
}