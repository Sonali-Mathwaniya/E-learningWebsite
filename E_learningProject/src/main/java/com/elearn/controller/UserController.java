package com.elearn.controller;
 

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.elearn.model.User;
import com.elearn.service.UserService;

@Controller
public class UserController {

    private final UserService userService;
    
    
    

    public UserController(UserService userService) {
		super();
		this.userService = userService;
	}

	@GetMapping(value = "/register")
    public String newUser(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping(value = "/register")
    public String saveUser(User user, Model model) {
        try {
            userService.createUser(user);
            return "registered";
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("error", e);
            return "error";
        }
    }

}
