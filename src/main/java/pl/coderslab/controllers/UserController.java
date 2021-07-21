package pl.coderslab.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.model.User;
import pl.coderslab.service.UserService;

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
}