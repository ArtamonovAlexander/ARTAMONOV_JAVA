package ru.home.darkroom.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.home.darkroom.form.SignUpForm;
import ru.home.darkroom.models.Role;
import ru.home.darkroom.models.User;
import ru.home.darkroom.repository.UsersRepository;

@Service
public class SignUpServiceImpl implements SignUpService {
    @Autowired
    UsersRepository usersRepository;

    @Autowired
    PasswordEncoder encoder;

    @Override
    public void signUp(SignUpForm form) {
        User user = User.builder()
                .firstName(form.getName())
                .login(form.getLogin().toLowerCase())
                .passwordHash(encoder.encode(form.getPassword()))
                .role(Role.GUEST)
                .build();

        usersRepository.save(user);
    }
}
