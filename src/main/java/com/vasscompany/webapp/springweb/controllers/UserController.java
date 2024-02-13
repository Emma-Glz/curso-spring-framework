package com.vasscompany.webapp.springweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){
        model.addAttribute("title", "Bienvenida");
        model.addAttribute("name", "Gustavo");
        model.addAttribute("lastname", "Gonzalez");
        return "details";
    }

}
