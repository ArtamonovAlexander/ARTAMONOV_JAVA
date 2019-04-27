package ru.home.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import ru.home.form.AuthUserForm;
import ru.home.form.UserForm;
import ru.home.model.Auth;
import ru.home.model.User;
import ru.home.repositiory.AuthRepository;
import ru.home.repositiory.UsersRepository;

import javax.servlet.http.Cookie;
import java.util.Optional;
import java.util.UUID;

@Component
public class AuthServiceImpl implements AuthService {

    @Autowired
    private AuthRepository authRepository;

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private PasswordEncoder encoder;

    @Override
    public void signUp(UserForm form) {
        String passwordHash = encoder.encode(form.getPassword());
        User user = User.builder()
                .login(form.getLogin())
                .password_hash(passwordHash)
                .firstName(form.getFirstName())
                .lastName(form.getLastName())
                .build();

        usersRepository.save(user);
    }

    @Override
    public Optional<String> signInAndCreateCookieValue(AuthUserForm form) {
        Optional<User> userCandidate = usersRepository.findOneByLogin(form.getLogin());
        if (userCandidate.isPresent()) {
            User user = userCandidate.get();
            if (encoder.matches(form.getPassword(), user.getPassword_hash())) {
                String value = UUID.randomUUID().toString();
                Auth auth = Auth.builder()
                        .user(user)
                        .value(value)
                        .build();
                authRepository.save(auth);
                return Optional.of(value);
            }
        }
        return Optional.empty();
    }

    @Override
    public Optional<User> findUserByCookie(Cookie cookie) {
        Optional<Auth> auth = authRepository.findByValue(cookie.getValue());
        if (auth.isPresent()) {
            return Optional.of(auth.get().getUser());
        } else return Optional.empty();
    }
}
