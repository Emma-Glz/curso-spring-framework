package com.vasscompany.webapp.springweb.controllers;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

    @GetMapping("/details2")
    public HashMap<String,Object> details(){
        HashMap<String,Object> body = new HashMap<>();

        body.put("title", "Bienvenida");
        body.put("name", "Gustavo");
        body.put("lastname", "Gonzalez");
        return body;
    }

}
