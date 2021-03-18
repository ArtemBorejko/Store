//package store.controllers;
//
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import store.services.implementations.UserServiceImpl;
//import store.entities.User;
//
//public class AdminController {
//    private final UserServiceImpl userService1;
//
//    public AdminController(UserServiceImpl userService){
//        userService1 = userService;
//    }
//
//    @GetMapping("/admin")
//    public String userList(Model model){
//        model.addAttribute("allUsers", userService1.allUsers());
//        return "admin";
//    }
//
//    @GetMapping("/addUser")
//    public String addUser(Model model){
//        model.addAttribute("user", new User());
//        return "reg";
//    }
//
//    @PostMapping("/addUser")
//    public String UserSubmit(@ModelAttribute User user, Model model){
//        model.addAttribute("user", user);
//        userService1.addUser(user);
//        return "resultOfUser";
//    }
//}
