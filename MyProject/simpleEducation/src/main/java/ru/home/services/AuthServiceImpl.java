package ru.home.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.home.model.Auth;
import ru.home.model.User;
import ru.home.repositiory.AuthRepository;

import javax.servlet.http.Cookie;
import java.util.Optional;

@Component
public class AuthServiceImpl implements AuthService {

    @Autowired
    private AuthRepository authRepository;

    @Override
    public Optional<User> findUserByCookie(Cookie cookie) {
        Optional<Auth> auth = authRepository.findByValue(cookie.getValue());
        if(auth.isPresent()){
            return Optional.of(auth.get().getUser());
        } else return Optional.empty();
    }
}
