package com.springapp.mvc.controller;

import com.springapp.mvc.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by Christian Araque on 24/08/2015.
 */
@Controller
public class LoginFormController {

    @RequestMapping(value = "/validateLogin")
    public String validateLogin(ModelMap model, User user){
        model.addAttribute("User", user.getUsername());
        model.addAttribute("Password", user.getPassword());
        model.addAttribute("table-visible", "visibility: visible");
        return "login";
    }

}
