package services;

import form.AuthUserForm;
import model.User;
import repositiory.UserRepository;

public class UsersService {
    private UserRepository userRepository;

    public UsersService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public void signUp(AuthUserForm form){
        User user = User.builder()
                .login(form.getLogin())
                .password_hash(form.getPassword())
                .build();

        userRepository.save(user);
    }
}
