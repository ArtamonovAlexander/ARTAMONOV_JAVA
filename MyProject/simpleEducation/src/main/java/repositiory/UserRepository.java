package repositiory;

import model.User;

import java.util.List;

public interface UserRepository extends Crud<User> {
    List<User> findAll();
}
