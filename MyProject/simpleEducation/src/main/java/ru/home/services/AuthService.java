package ru.home.services;

import ru.home.form.AuthUserForm;
import ru.home.form.UserForm;
import ru.home.model.User;

import javax.servlet.http.Cookie;
import java.util.Optional;

public interface AuthService {
    Optional<User> findUserByCookie(Cookie cookie);

    void signUp(UserForm form);

    Optional<String> signInAndCreateCookieValue(AuthUserForm form);
}
