package pl.coderslab.service;

import org.springframework.stereotype.Service;
import pl.coderslab.model.User;

import java.util.List;

public interface UserService {

    User findUserByUsername(String name);
    User findUserByEmail(String email);
    void save(User user);
    void deleteUser(long id);
    List<User> findAllUsers();
}