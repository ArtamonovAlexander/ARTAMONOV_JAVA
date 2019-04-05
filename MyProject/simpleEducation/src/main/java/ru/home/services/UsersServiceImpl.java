package ru.home.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.home.form.AuthUserForm;
import ru.home.form.UserForm;
import ru.home.model.Auth;
import ru.home.model.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import ru.home.repositiory.AuthRepository;
import ru.home.repositiory.UserRepository;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
public class UsersServiceImpl implements UsersService{
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AuthRepository authRepository;
    @Autowired
    private PasswordEncoder encoder;


    @Override
    public void signUp(AuthUserForm form){
        String passwordHash = encoder.encode(form.getPassword());
        User user = User.builder()
                .login(form.getLogin())
                .password_hash(passwordHash)
                .build();

        userRepository.save(user);
    }

    @Override
    public Optional<String> signInAndCreateCookieValue(AuthUserForm form) {
        Optional<User> userCandidate = userRepository.findOneByLogin(form.getLogin());
        if(userCandidate.isPresent()){
            User user = userCandidate.get();
            if(encoder.matches(form.getPassword(), user.getPassword_hash())){
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
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void addUser(UserForm form) {
        User user = User.builder()
                .firstName(form.getFirstName())
                .lastName(form.getLastName())
                .build();

        userRepository.save(user);
    }
}
