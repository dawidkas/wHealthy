package pl.coderslab.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.coderslab.model.User;
import pl.coderslab.service.UserService;

import javax.validation.Valid;

@Controller
public class UserController {
//    private final UserService service;
//
//
//    public UserController(UserService service) {
//        this.service = service;
//    }
//
//    @GetMapping("/register")
//    public String registration(User user) {
//        return "user/registration";
//    }
//
//    @PostMapping("/register")
//    public String registerPost(@Valid User user, BindingResult result, @RequestParam String password, @RequestParam String repassword) {
//        if (password.equals(repassword) && !result.hasErrors()) {
//            service.saveUser(user);
//            return "user/login";
//        } else {
//            return "user/registration";
//        }
//    }

}