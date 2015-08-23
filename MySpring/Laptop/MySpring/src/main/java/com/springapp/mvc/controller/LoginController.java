package com.springapp.mvc.controller;

import com.springapp.mvc.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
    @RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.HEAD})
    public String printWelcome(ModelMap model) {
        return "login";
    }

    @RequestMapping(value = "/validateLogin", method = RequestMethod.POST)
    public String login(ModelMap model, User user) {
        if (user.getUsername().equals("caraque")) {
            model.addAttribute("message", "Te has logueado bajo el nombre de " + user.getUsername());
            model.addAttribute("style_div","text-align: center; background: turquoise; padding: 22px; border-radius: 28px;");
        } else {
            model.addAttribute("message", "Usuario incorrecto");
        }
        return "login";
    }
}