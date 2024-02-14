package com.vasscompany.webapp.springweb.controllers;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vasscompany.webapp.springweb.models.User;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public HashMap<String,Object> details(){
        HashMap<String,Object> body = new HashMap<>();
        User usuario = new User("juan", "Garza");

        body.put("title", "Bienvenida");
        body.put("user", usuario);
        //body.put("lastname", "Gonzalez");
        return body;
    }

}
