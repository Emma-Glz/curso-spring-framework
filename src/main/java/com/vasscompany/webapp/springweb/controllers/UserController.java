package com.vasscompany.webapp.springweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.vasscompany.webapp.springweb.models.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){
        User usuario = new User("Gustavo","Flores");

        model.addAttribute("title", "Bienvenida");
        model.addAttribute("user", usuario);
        //model.addAttribute("name", "Gustavo");
        //model.addAttribute("lastname", "Gonzalez");
        return "details"; //html
    }

}
