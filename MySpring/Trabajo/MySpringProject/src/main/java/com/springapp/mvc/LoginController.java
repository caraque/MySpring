package com.springapp.mvc;

import dto.User;
import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @RequestMapping(value = "/")
    public String index(ModelMap model) {
        return "index";
    }

    @RequestMapping(value = "/login")
    public String login(ModelMap model, HttpServletRequest request){
        User user = new User();
        user.setUser("Christian");
        user.setPassword("123456");
        model.addAttribute("user", user);
        return "login";
    }

    @RequestMapping(value="/validateLogin", method = RequestMethod.POST)
    public String validatelogin(User user, ModelMap model){
        model.put("message", user.getUser() + " - " + user.getPassword());
        model.addAttribute("user", user.getUser());
        return "login";
    }
}