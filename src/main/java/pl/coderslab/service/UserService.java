package pl.coderslab.service;

import org.springframework.stereotype.Service;
import pl.coderslab.model.User;

import java.util.List;

@Service
public interface UserService {

    User findByUserName(String name);
    User findUserByEmail(String email);
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(long id);
    List<User> showAllUsers();
}
