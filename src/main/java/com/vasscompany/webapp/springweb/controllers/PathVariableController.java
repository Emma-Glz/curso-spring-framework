package com.vasscompany.webapp.springweb.controllers;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vasscompany.webapp.springweb.models.User;
import com.vasscompany.webapp.springweb.models.dto.ParamDto;

@RestController
@RequestMapping("api/var")
public class PathVariableController {
    @Value("${config.code}")
    private Integer code;

    @Value("${config.username}")
    private String username;

    @Value("${config.message}")
    private String message;

    @Value("#{'${config.listOfFruits}'.toUpperCase()}")
    private String fruitsString;

    @Value("${config.listOfFruits}")
    private List<String> fruits;

    @RequestMapping("/baz/{message}")
    public ParamDto baz(@PathVariable(name = "message") String msj) {
        ParamDto param = new ParamDto();
        param.setMessage(msj);

        return param;
    }

    @PostMapping("/create")
    public User user(@RequestBody User user) {
        User usr = new User();
        usr.setName(user.getName());
        usr.setLastname(user.getLastname());
        usr.setEmail(user.getEmail());
        return usr;
    }

    @GetMapping("/values")
    public HashMap<String,Object> mix(){
        HashMap<String,Object> json = new HashMap<>();
        json.put("code", code);
        json.put("username", username);
        json.put("message", message);
        json.put("fruitsString", fruitsString);
        json.put("fruits", fruits);

        return json;
    }
}
