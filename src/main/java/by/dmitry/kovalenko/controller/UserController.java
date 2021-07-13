package by.dmitry.kovalenko.controller;

import by.dmitry.kovalenko.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by user on 04.02.2019.
 */
@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping( method = RequestMethod.GET)
    public String getAll(Model model) {
        model.addAttribute("users", userService.findAll());
        return "users";
    }




}
