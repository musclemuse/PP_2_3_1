package ppcrud.controller;

import ppcrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class UserController {

private UserService userService;

@Autowired
public void setUserService(UserService userService) {
    this.userService = userService;
}

    @GetMapping(value = "index")
    public String allUsers(ModelMap model) {
        model.addAttribute("users", userService.listOfAllUsers());
        return "index";
    }
}
