package ppcrud.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ppcrud.model.User;
import ppcrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

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

    //    @PostMapping
//    public String createUser(@ModelAttribute("user") User user) {
//        userService.add(user);
//        return "redirect: /index";
//    }
//
//    @GetMapping("add")
//    public String createUserForm(@ModelAttribute("user") User user) {
//        return "add";
//    }
    @RequestMapping(value = "addNewUser")
    public String addNewUser(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "user-info";
    }

    @RequestMapping(value = "saveUser")
    public String saveUser(@ModelAttribute("user") User user) {
        userService.add(user);
        return "redirect:/index";
    }
    @RequestMapping(value = "updateInfo")
    public String updateUser(@RequestParam("id") int id, Model model) {
        User user = userService.getUserById(id);
        model.addAttribute("user", user);
    return "user-info";

    }
}
