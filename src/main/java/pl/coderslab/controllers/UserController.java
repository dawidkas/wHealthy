package pl.coderslab.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.model.User;
import pl.coderslab.service.UserService;

import java.util.List;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String showRegistration(User user) {
        return "user/registration";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(User user, BindingResult result) {
        if (result.hasErrors()) {
            return "user/registration";
        }
        userService.save(user);
        return "user/login";
    }

    @GetMapping("/login")
    public String showLogin(User user) {
        return "user/login";
    }

    @PostMapping("/login")
    public String postLogin(@RequestParam String username, @RequestParam String password, Model model) {
        List<User> userList = userService.findAllUsers();
        if (userList.size() > 0 && username !=null && !username.isBlank() && password != null && !password.isBlank()) {
            for (int i = 0; i < userList.size(); i++) {
                if (userList.get(i).getUsername().equals(username) && BCrypt.checkpw(password, userList.get(i).getPassword())) {
                    User user = userService.findUserByUsername(username);
                    model.addAttribute("user", user);
                    return "redirect:http://localhost:8080/";
                }
            }
        } return "user/login";
    }
}