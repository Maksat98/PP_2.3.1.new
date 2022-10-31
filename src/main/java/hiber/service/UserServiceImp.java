package hiber.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import hiber.dao.UserDao;
import hiber.model.User;
import javax.validation.Valid;
import java.util.List;

@Service
public class UserServiceImp implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public Object getUserById(int id) {
        return userDao.getUserById(id);
    }
    @Transactional 
    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }
    @Transactional
    @Override
    public void removeUser(int id) {
        userDao.removeUser(id);
    }
    @Transactional
    @Override
    public void updateUser(@Valid User user) {
        userDao.updateUser(user);
    }
}
