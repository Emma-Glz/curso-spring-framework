package com.vasscompany.webapp.springweb.controllers;

import java.util.Arrays;
import java.util.List;

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

    @GetMapping("/list")
    public String list(Model model){
        //poblar la lista
        List<User> users = Arrays.asList(
            new  User("Raul", "Jimenez", "rj@gmail.com"),
            new  User("Tony", "Montana", "tm@gmail.com"),
            new  User("Juaquin", "Lopez")
        );

        model.addAttribute("users", users);
        model.addAttribute("title", "listado de usuarios!");
        return "list"; //html
    }

}
