package com.elearn.controller;

import com.elearn.service.UserService;
import com.ezlearning.platform.dto.UserDto;
 import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    private final UserService userService;
    
    
    

    public UserController(UserService userService) {
		super();
		this.userService = userService;
	}

	@GetMapping(value = "/register")
    public String newUser(Model model) {
        model.addAttribute("userdto", new UserDto());
        return "register";
    }

    @PostMapping(value = "/register")
    public String saveUser(UserDto userDto, Model model) {
        try {
            userService.createUser(userDto);
            return "registered";
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("error", e);
            return "error";
        }
    }

}