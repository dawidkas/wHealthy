package pl.coderslab.service;

import org.springframework.stereotype.Service;
import pl.coderslab.model.User;
import pl.coderslab.repository.UserRepository;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User findUserByUsername(String username) {
        return userRepository.findUserByUsername(username);
    }


    @Override
    public User findUserByEmail(String email) {
        return null;
    }

    @Override
    public void save(User user) {

    }

    @Override
    public void deleteUser(long id) {

    }

    @Override
    public List<User> findAllUsers() {
        return null;
    }
}