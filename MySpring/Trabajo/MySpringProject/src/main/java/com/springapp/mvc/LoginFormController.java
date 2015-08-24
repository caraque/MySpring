package com.springapp.mvc;

import dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Christian Araque on 19/08/2015.
 */
@Controller
@RequestMapping("/loginForm")
public class LoginFormController {


    @RequestMapping(method = RequestMethod.GET)
    protected String prueba(ModelMap map){
        return "hello";
    }

    @RequestMapping(method = RequestMethod.POST)
    protected String validateUser(User user, HttpServletRequest request){
        System.out.println("Hola mi pana");
        return "login";
    }

}
