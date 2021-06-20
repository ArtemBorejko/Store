package store.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistrationController {

    @GetMapping("login")
    public String login(){
        return "login";
    }

    @GetMapping("login-failed")
    public String loginFailed(Model model){
        model.getAttribute("error");
        return "login-failed";
    }


}
