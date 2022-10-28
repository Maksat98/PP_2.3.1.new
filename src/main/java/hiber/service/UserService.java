package hiber.service;

import hiber.model.User;
import javax.validation.Valid;
import java.util.List;

public interface UserService {

    List<User> getAllUsers ();
    Object getUserById(int id);
    void addUser(User user);
    void removeUser(int id);
    void updateUser(@Valid User user);
}